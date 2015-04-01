package hu.safi.language.client;

import hu.safi.language.shared.serialized.ItemSer;
import hu.safi.language.shared.serialized.SubThemeSer;
import hu.safi.language.shared.serialized.ThemeSer;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface LanguageServiceAsync {

	void codecheck(String code, AsyncCallback<String> callback)
			throws IllegalArgumentException;

	void themes(AsyncCallback<List<ThemeSer>> callback)
			throws IllegalArgumentException;

	void addTheme(ThemeSer themeSer, AsyncCallback<ThemeSer> callback)
			throws IllegalArgumentException;

	void subthemes(String theme, AsyncCallback<List<SubThemeSer>> callback)
			throws IllegalArgumentException;

	void addSubTheme(String subTheme, SubThemeSer subThemeSer,
			AsyncCallback<SubThemeSer> callback)
			throws IllegalArgumentException;

	void items(String subTheme, AsyncCallback<List<ItemSer>> callback)
			throws IllegalArgumentException;

	void addItem(String subTheme, ItemSer itemSer,
			AsyncCallback<ItemSer> callback) throws IllegalArgumentException;

	void item(String subTheme, AsyncCallback<List<ItemSer>> callback)
			throws IllegalArgumentException;
}
