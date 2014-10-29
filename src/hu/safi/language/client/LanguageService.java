package hu.safi.language.client;

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
	
	List<ThemeSer> themes () throws IllegalArgumentException;
	
	List<SubThemeSer> subthemes (String theme) throws IllegalArgumentException;
	
	List<ItemSer> items (String subTheme) throws IllegalArgumentException;
	
	List<ItemSer> item (String subTheme) throws IllegalArgumentException;
}
