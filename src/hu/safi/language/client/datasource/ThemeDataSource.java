package hu.safi.language.client.datasource;

import hu.safi.language.client.ClientConstants;
import hu.safi.language.client.ClientLabels;
import hu.safi.language.shared.serialized.ThemeSer;

import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.smartgwt.client.data.DSRequest;
import com.smartgwt.client.data.DSResponse;
import com.smartgwt.client.data.DataSourceField;
import com.smartgwt.client.data.fields.DataSourceTextField;
import com.smartgwt.client.rpc.RPCResponse;
import com.smartgwt.client.widgets.form.fields.TextItem;
import com.smartgwt.client.widgets.grid.ListGridRecord;

public class ThemeDataSource extends GwtRpcDataSource {

	@SuppressWarnings("deprecation")
	public ThemeDataSource() {

		TextItem textItem = new TextItem();
		textItem.setWidth("350");

		DataSourceField field;

		field = new DataSourceTextField(ClientConstants.THEME_KEY, ClientLabels.THEME_KEY);
		field.setPrimaryKey(true);
		field.setHidden(true);
		addField(field);

		field = new DataSourceTextField(ClientConstants.THEME_NAME, ClientLabels.THEME_NAME);
		field.setRequired(true);
		field.setEditorType(textItem);
		addField(field);

		field = new DataSourceTextField(ClientConstants.THEME_ORDER, ClientLabels.THEME_ORDER);		
		field.setHidden(true);
		addField(field);

	}

	@Override
	protected void executeFetch(final String requestId, final DSRequest request, final DSResponse response) {
		languageService.themes(new AsyncCallback<List<ThemeSer>>() {
			public void onFailure(Throwable caught) {
				response.setStatus(RPCResponse.STATUS_FAILURE);
				processResponse(requestId, response);
			}

			public void onSuccess(List<ThemeSer> result) {
				ListGridRecord[] list = new ListGridRecord[result.size()];
				if ((result.size() > 0) && (result.get(0).getError() != null))
					response.setAttribute(ClientConstants.ERROR, result.get(0).getError());
				for (int i = 0; i < list.length; i++) {
					ListGridRecord record = new ListGridRecord();
					copyValues(result.get(i), record);
					list[i] = record;
				}
				response.setData(list);
				processResponse(requestId, response);
			}
		});
	}

	@Override
	protected void executeAdd(final String requestId, final DSRequest request, final DSResponse response) {

		JavaScriptObject data = request.getData();
		ListGridRecord rec = new ListGridRecord(data);
		ThemeSer themeSer = new ThemeSer();
		copyValues(rec, themeSer);
		languageService.addTheme(themeSer, new AsyncCallback<ThemeSer>() {
			public void onFailure(Throwable caught) {
				response.setStatus(DSResponse.STATUS_FAILURE);
				processResponse(requestId, response);
			}

			public void onSuccess(ThemeSer result) {
				ListGridRecord[] list = new ListGridRecord[1];
				ListGridRecord newRec = new ListGridRecord();
				copyValues(result, newRec);
				list[0] = newRec;
				response.setData(list);
				processResponse(requestId, response);
			}
		});

	}

	@Override
	protected void executeUpdate(final String requestId, final DSRequest request, final DSResponse response) {

	}

	@Override
	protected void executeRemove(final String requestId, final DSRequest request, final DSResponse response) {

	}

	private static void copyValues(ThemeSer from, ListGridRecord to) {
		to.setAttribute(ClientConstants.THEME_KEY, from.getKey());
		to.setAttribute(ClientConstants.THEME_NAME, from.getName());
		to.setAttribute(ClientConstants.THEME_ORDER, from.getOrder());
	}

	private static void copyValues(ListGridRecord from, ThemeSer to) {

		to.setKey(from.getAttributeAsString(ClientConstants.THEME_KEY));
		to.setName(from.getAttributeAsString(ClientConstants.THEME_NAME));
		to.setOrder(from.getAttributeAsString(ClientConstants.THEME_ORDER));
	}

}
