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

	void themes(AsyncCallback<List<ThemeSer>> callback) throws IllegalArgumentException;
	
	void subthemes(String theme, AsyncCallback<List<SubThemeSer>> callback) throws IllegalArgumentException;
	
	void items(String subTheme, AsyncCallback<List<ItemSer>> callback) throws IllegalArgumentException;

	void item(String subTheme, AsyncCallback<List<ItemSer>> callback) throws IllegalArgumentException;
}
