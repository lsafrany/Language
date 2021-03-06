package hu.safi.language.server;

import hu.safi.language.client.LanguageService;
import hu.safi.language.server.jdo.Item;
import hu.safi.language.server.jdo.PMF;
import hu.safi.language.server.jdo.SubTheme;
import hu.safi.language.server.jdo.Theme;
import hu.safi.language.shared.serialized.ExceptionSer;
import hu.safi.language.shared.serialized.ItemSer;
import hu.safi.language.shared.serialized.SubThemeSer;
import hu.safi.language.shared.serialized.ThemeSer;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class LanguageServiceImpl extends RemoteServiceServlet implements LanguageService {

	public String codecheck(String code) throws IllegalArgumentException {
		String result = "FALSE";

		if (code.equals("SafiKing"))
			result = "TRUE";

		return result;
	}

	public ArrayList<ThemeSer> themes(String mode) throws IllegalArgumentException {

		PersistenceManager pm = PMF.get().getPersistenceManager();
		ArrayList<ThemeSer> themes = new ArrayList<ThemeSer>();
		try {
			Query query = pm.newQuery("select from " + Theme.class.getName());
			query.setFilter("(mode == pMode)");
			query.declareParameters("String pMode");

			@SuppressWarnings("unchecked")
			List<Theme> list = (List<Theme>) pm.newQuery(query).execute(mode);
			if (!list.isEmpty()) {
				for (Theme t : list) {
					ThemeSer themeSer = new ThemeSer();
					themeSer.setKey(t.getKey().toString());
					themeSer.setName(t.getName());
					themeSer.setOrder(t.getOrder());
					themes.add(themeSer);
				}
			}
		} catch (Exception e) {
			ThemeSer themeSer = new ThemeSer();
			themeSer.setError(e.getMessage());
			themes.add(themeSer);
		} finally {
			pm.close();
		}

		return themes;
	}

	public ThemeSer addTheme(ThemeSer themeSer) throws IllegalArgumentException, ExceptionSer {

		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			Query query = pm.newQuery("select from " + Theme.class.getName());
			@SuppressWarnings("unchecked")
			List<SubTheme> list = (List<SubTheme>) pm.newQuery(query).execute();
			Integer count = 0;
			if (!list.isEmpty()) {
				count = list.size();
			}
			count++;
			Theme theme = new Theme(themeSer.getName(),count.toString(),themeSer.getMode());
			pm.makePersistent(theme);
			themeSer.setKey(theme.getKey().toString());
			pm.flush();
		} catch (Exception e) {
			throw new ExceptionSer(e.getMessage());
		} finally {
			pm.close();
		}

		return themeSer;
	}

	public ArrayList<SubThemeSer> subthemes(String theme) throws IllegalArgumentException {

		PersistenceManager pm = PMF.get().getPersistenceManager();
		ArrayList<SubThemeSer> subThemes = new ArrayList<SubThemeSer>();
		try {
			Query query = pm.newQuery("select from " + SubTheme.class.getName());
			query.setFilter("(theme == pTheme)");
			query.declareParameters("String pTheme");

			@SuppressWarnings("unchecked")
			List<SubTheme> list = (List<SubTheme>) pm.newQuery(query).execute(
					pm.getObjectById(Theme.class, KeyToID(theme)).getKey());
			if (!list.isEmpty()) {
				for (SubTheme s : list) {
					SubThemeSer subThemeSer = new SubThemeSer();
					subThemeSer.setKey(s.getKey().toString());
					subThemeSer.setName(s.getName());
					subThemeSer.setLang(s.getLang());
					subThemeSer.setOrder(s.getOrder());
					subThemes.add(subThemeSer);
				}
			}
		} catch (Exception e) {
			SubThemeSer subThemeSer = new SubThemeSer();
			subThemeSer.setError(e.getMessage());
			subThemes.add(subThemeSer);
		} finally {
			pm.close();
		}

		return subThemes;
	}

	public SubThemeSer addSubTheme(String themeID, SubThemeSer subThemeSer) throws IllegalArgumentException, ExceptionSer {

		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {

			Query query = pm.newQuery("select from " + SubTheme.class.getName());
			@SuppressWarnings("unchecked")
			List<SubTheme> list = (List<SubTheme>) pm.newQuery(query).execute();
			Integer count = 0;
			if (!list.isEmpty()) {
				count = list.size();
			}
			count++;
			Theme theme = pm.getObjectById(Theme.class, KeyToID(themeID));
			SubTheme subTheme = new SubTheme(theme.getKey(), subThemeSer.getName(),subThemeSer.getLang(),count.toString());
			pm.makePersistent(subTheme);
			subThemeSer.setKey(subTheme.getKey().toString());
			pm.flush();
		} catch (Exception e) {
			throw new ExceptionSer(e.getMessage());
		} finally {
			pm.close();
		}

		return subThemeSer;
	}

	public ArrayList<ItemSer> items(String subTheme) throws IllegalArgumentException {

		PersistenceManager pm = PMF.get().getPersistenceManager();
		ArrayList<ItemSer> items = new ArrayList<ItemSer>();
		try {
			Query query = pm.newQuery("select from " + Item.class.getName());
			query.setFilter("(subtheme == pSubTheme)");
			query.declareParameters("String pSubTheme");
			@SuppressWarnings("unchecked")
			List<Item> list = (List<Item>) pm.newQuery(query).execute(pm.getObjectById(SubTheme.class, KeyToID(subTheme)).getKey());
			if (!list.isEmpty()) {
				for (Item i : list) {
					ItemSer itemSer = new ItemSer();
					itemSer.setKey(i.getKey().toString());
					itemSer.setFrom(i.getFrom());
					itemSer.setTo(i.getTo());
					items.add(itemSer);
				}
			}
		} catch (Exception e) {
			ItemSer itemSer = new ItemSer();
			itemSer.setError(e.getMessage());
			items.add(itemSer);
		} finally {
			pm.close();
		}

		return items;
	}

	public ItemSer addItem(String subthemeID, ItemSer itemSer) throws IllegalArgumentException, ExceptionSer {

		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {

			SubTheme subTheme = pm.getObjectById(SubTheme.class, KeyToID(subthemeID));
			Item item = new Item(subTheme.getKey(), itemSer.getFrom(), itemSer.getTo());
			pm.makePersistent(item);
			itemSer.setKey(item.getKey().toString());
			pm.flush();
		} catch (Exception e) {
			throw new ExceptionSer(e.getMessage());
		} finally {
			pm.close();
		}

		return itemSer;
	}

	public ArrayList<ItemSer> item(String subTheme) throws IllegalArgumentException {

		PersistenceManager pm = PMF.get().getPersistenceManager();
		ArrayList<ItemSer> items = new ArrayList<ItemSer>();
		try {
			Query query = pm.newQuery("select from " + Item.class.getName());
			query.setFilter("(subtheme == pSubTheme)");
			query.declareParameters("String pSubTheme");
			@SuppressWarnings("unchecked")
			List<Item> list = (List<Item>) pm.newQuery(query).execute(pm.getObjectById(SubTheme.class, KeyToID(subTheme)).getKey());
			if (!list.isEmpty()) {
				Item item = list.get((int) Math.floor(Math.random() * list.size()));
				ItemSer itemSer = new ItemSer();
				itemSer.setKey(item.getKey().toString());
				itemSer.setFrom(item.getFrom());
				itemSer.setTo(item.getTo());
				items.add(itemSer);
			}
		} catch (Exception e) {
			ItemSer itemSer = new ItemSer();
			itemSer.setError(e.getMessage());
			items.add(itemSer);
		} finally {
			pm.close();
		}

		return items;
	}

	private long KeyToID(String key) {
		key = key.substring(key.indexOf("(") + 1, key.indexOf(")"));
		return Long.valueOf(key).longValue();
	}

}
