package hu.safi.language.client;

import hu.safi.language.shared.serialized.ExceptionSer;
import hu.safi.language.shared.serialized.ItemSer;
import hu.safi.language.shared.serialized.SubThemeSer;
import hu.safi.language.shared.serialized.ThemeSer;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("data")
public interface LanguageService extends RemoteService {

	String codecheck(String code) throws IllegalArgumentException;

	List<ThemeSer> themes() throws IllegalArgumentException;

	ThemeSer addTheme(ThemeSer themeSer) throws IllegalArgumentException, ExceptionSer;

	List<SubThemeSer> subthemes(String theme) throws IllegalArgumentException;

	SubThemeSer addSubTheme(String subTheme, SubThemeSer subThemeSer)
			throws IllegalArgumentException, ExceptionSer;

	List<ItemSer> items(String subTheme) throws IllegalArgumentException;

	ItemSer addItem(String subTheme, ItemSer itemSer)
			throws IllegalArgumentException, ExceptionSer;

	List<ItemSer> item(String subTheme) throws IllegalArgumentException;
}
