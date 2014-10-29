package hu.safi.language.client.datasource;

import hu.safi.language.client.ClientConstants;
import hu.safi.language.client.ClientLabels;
import hu.safi.language.shared.serialized.SubThemeSer;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.smartgwt.client.data.DSRequest;
import com.smartgwt.client.data.DSResponse;
import com.smartgwt.client.data.DataSourceField;
import com.smartgwt.client.data.fields.DataSourceTextField;
import com.smartgwt.client.rpc.RPCResponse;
import com.smartgwt.client.widgets.grid.ListGridRecord;

public class SubThemeDataSource
    extends GwtRpcDataSource {
	
    public SubThemeDataSource () {
   
        DataSourceField field;
                
        field = new DataSourceTextField (ClientConstants.SUBTHEME_KEY, ClientLabels.SUBTHEME_KEY);
        field.setPrimaryKey (true);
        field.setHidden(true);
        addField (field);
        
        field = new DataSourceTextField (ClientConstants.SUBTHEME_NAME, ClientLabels.SUBTHEME_NAME);
        field.setRequired(true);   
        addField (field);
                       
    }

    @Override
    protected void executeFetch (final String requestId, final DSRequest request, final DSResponse response) {
    	languageService.subthemes (request.getCriteria().getAttribute(ClientConstants.THEME_KEY),new AsyncCallback<List<SubThemeSer>> () {
            public void onFailure (Throwable caught) {
                response.setStatus (RPCResponse.STATUS_FAILURE);
                processResponse (requestId, response);
            }
            public void onSuccess (List<SubThemeSer> result) {            	
                ListGridRecord[] list = new ListGridRecord[result.size ()];
                if ((result.size() > 0) && (result.get(0).getError() != null)) response.setAttribute(ClientConstants.ERROR, result.get(0).getError());                
                for (int i = 0; i < list.length; i++) {
                    ListGridRecord record = new ListGridRecord ();
                    copyValues (result.get (i), record);
                    list[i] = record;
                }
                response.setData (list);
                processResponse (requestId, response);
            }
        });
    }

    @Override
    protected void executeAdd (final String requestId, final DSRequest request, final DSResponse response) {
 
    }

    @Override
    protected void executeUpdate (final String requestId, final DSRequest request, final DSResponse response) {
  
    }
    
	@Override
    protected void executeRemove (final String requestId, final DSRequest request, final DSResponse response) {

    }

    private static void copyValues (SubThemeSer from, ListGridRecord to) {
    	to.setAttribute (ClientConstants.THEME_KEY, from.getKey());
       	to.setAttribute (ClientConstants.THEME_NAME, from.getName());
     }

}
