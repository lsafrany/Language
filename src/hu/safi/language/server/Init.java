// http://127.0.0.1:8888/language/init
// http://language-hrd.appspot.com/language/init

package hu.safi.language.server;

import hu.safi.language.server.jdo.Item;
import hu.safi.language.server.jdo.Load;
import hu.safi.language.server.jdo.PMF;
import hu.safi.language.server.jdo.SubTheme;
import hu.safi.language.server.jdo.Theme;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Init extends HttpServlet {

	private static final Logger log = Logger.getLogger(Init.class.getName());

	@SuppressWarnings("unused")
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		log.info(new Date() + " start.");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.append("<html>");
		out.append("<head>");
		out.append("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">");
		out.append("</head>");
		out.append("<body>");

		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {

			Boolean needLoad = false;
			/*
			 * Query loads = pm.newQuery(Load.class);
			 * loads.deletePersistentAll(); Load load = new Load(true);
			 * pm.makePersistent(load);
			 */
			Query queryLoad = pm.newQuery("select from " + Load.class.getName());
			@SuppressWarnings("unchecked")
			List<Load> loadList = (List<Load>) pm.newQuery(queryLoad).execute();
			if (!loadList.isEmpty()) {
				for (Load l : loadList) {
					needLoad = l.getLoad();
				}
			}

			if (needLoad) {

				log.info(new Date() + "loading ...");

				Query themes = pm.newQuery(Theme.class);
				themes.deletePersistentAll();

				Theme theme1 = new Theme("Kis angol nyelvtan");
				pm.makePersistent(theme1);

				Theme theme2 = new Theme("Angol szavak és kifejezések");
				pm.makePersistent(theme2);

				Query subThemes = pm.newQuery(SubTheme.class);
				subThemes.deletePersistentAll();

				Query queryTheme = pm.newQuery("select from " + Theme.class.getName());
				@SuppressWarnings("unchecked")
				List<Theme> themeList = (List<Theme>) pm.newQuery(queryTheme).execute();
				if (!themeList.isEmpty()) {
					for (Theme t : themeList) {
						if (t.getName().equals("Kis angol nyelvtan")) {
							SubTheme subTheme1 = new SubTheme(t.getKey(), "Fordítási gyakorlat");
							pm.makePersistent(subTheme1);
						}
						if (t.getName().equals("Angol szavak és kifejezések")) {
							SubTheme subTheme1 = new SubTheme(t.getKey(), "Első rész");
							pm.makePersistent(subTheme1);
						}
					}
				}

				Query items = pm.newQuery(Item.class);
				items.deletePersistentAll();

				Kis_angol_nyelvtan__Forditasi_gyakorlat1 kis_angol_nyelvtan__Forditasi_gyakorlat1 = new Kis_angol_nyelvtan__Forditasi_gyakorlat1(
						pm);
				Kis_angol_nyelvtan__Forditasi_gyakorlat2 kis_angol_nyelvtan__Forditasi_gyakorlat2 = new Kis_angol_nyelvtan__Forditasi_gyakorlat2(
						pm);

				Angol_szavak_es_kifejezesek__Elso_resz1 angol_szavak_es_kifejezesek__Elso_resz1 = new Angol_szavak_es_kifejezesek__Elso_resz1(
						pm);
				Angol_szavak_es_kifejezesek__Elso_resz2 angol_szavak_es_kifejezesek__Elso_resz2 = new Angol_szavak_es_kifejezesek__Elso_resz2(
						pm);

				Query resultSubThemes = pm.newQuery("select from " + SubTheme.class.getName());
				@SuppressWarnings("unchecked")
				List<SubTheme> resultSubThemesList = (List<SubTheme>) pm.newQuery(resultSubThemes).execute();
				if (!resultSubThemesList.isEmpty()) {

					for (SubTheme result : resultSubThemesList) {

						Theme theme = pm.getObjectById(Theme.class, result.getTheme());

						out.append("<h1>" + theme.getName() + "</h1>");
						out.append("<h2>" + result.getName() + "</h1>");

						Query subquery = pm.newQuery("select from " + Item.class.getName());
						subquery.setFilter("(subtheme == pSubTheme)");
						subquery.declareParameters("String pSubTheme");
						@SuppressWarnings("unchecked")
						List<Item> list = (List<Item>) pm.newQuery(subquery).execute(result.getKey());
						if (!list.isEmpty()) {
							out.append("<table>");
							for (Item it : list) {
								out.append("<tr><td>" + it.getFrom() + " - " + it.getTo() + "</td></tr>");
							}
							out.append("</table>");
						}
					}
				}

				@SuppressWarnings("unchecked")
				List<Load> loadnotneedList = (List<Load>) pm.newQuery(queryLoad).execute();
				if (!loadnotneedList.isEmpty()) {
					for (Load l : loadList) {
						l.setLoad(Boolean.FALSE);
					}
				}

			}

		} finally {
			pm.close();
		}

		out.append("</body>");
		out.append("</html>");

		out.println();
		log.info(new Date() + " stop.");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
