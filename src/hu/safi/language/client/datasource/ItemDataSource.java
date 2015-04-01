package hu.safi.language.client.datasource;

import hu.safi.language.client.ClientConstants;
import hu.safi.language.client.ClientLabels;
import hu.safi.language.shared.serialized.ItemSer;

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

public class ItemDataSource extends GwtRpcDataSource {

	boolean full = true;

	String subtheme_key = "";
	
	public ItemDataSource(boolean mode) {

		TextItem textItem = new TextItem();
		textItem.setWidth("350");

		this.full = mode;
		DataSourceField field;

		field = new DataSourceTextField(ClientConstants.ITEM_KEY,
				ClientLabels.ITEM_KEY);
		field.setPrimaryKey(true);
		field.setHidden(true);
		addField(field);

		field = new DataSourceTextField(ClientConstants.ITEM_FROM,
				ClientLabels.ITEM_FROM);
		field.setRequired(true);
		field.setEditorType(textItem);
		addField(field);

		field = new DataSourceTextField(ClientConstants.ITEM_TO,
				ClientLabels.ITEM_TO);
		field.setRequired(true);
		field.setEditorType(textItem);
		addField(field);

	}

	@Override
	protected void executeFetch(final String requestId,
			final DSRequest request, final DSResponse response) {
		subtheme_key = request.getCriteria().getAttribute(
				ClientConstants.SUBTHEME_KEY);
		if (full) {
			languageService.items(
					subtheme_key,
					new AsyncCallback<List<ItemSer>>() {
						public void onFailure(Throwable caught) {
							response.setStatus(RPCResponse.STATUS_FAILURE);
							processResponse(requestId, response);
						}

						public void onSuccess(List<ItemSer> result) {
							ListGridRecord[] list = new ListGridRecord[result
									.size()];
							if ((result.size() > 0)
									&& (result.get(0).getError() != null))
								response.setAttribute(ClientConstants.ERROR,
										result.get(0).getError());
							for (int i = 0; i < list.length; i++) {
								ListGridRecord record = new ListGridRecord();
								copyValues(result.get(i), record);
								list[i] = record;
							}
							response.setData(list);
							processResponse(requestId, response);
						}
					});
		} else {
			languageService.item(
					subtheme_key,
					new AsyncCallback<List<ItemSer>>() {
						public void onFailure(Throwable caught) {
							response.setStatus(RPCResponse.STATUS_FAILURE);
							processResponse(requestId, response);
						}

						public void onSuccess(List<ItemSer> result) {
							ListGridRecord[] list = new ListGridRecord[result
									.size()];
							if ((result.size() > 0)
									&& (result.get(0).getError() != null))
								response.setAttribute(ClientConstants.ERROR,
										result.get(0).getError());
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
	}

	@Override
	protected void executeAdd(final String requestId, final DSRequest request,
			final DSResponse response) {

		JavaScriptObject data = request.getData();
		ListGridRecord rec = new ListGridRecord(data);
		ItemSer itemSer = new ItemSer();
		copyValues(rec, itemSer);
		languageService.addItem(subtheme_key, itemSer, new AsyncCallback<ItemSer>() {
			public void onFailure(Throwable caught) {
				response.setStatus(DSResponse.STATUS_FAILURE);
				processResponse(requestId, response);
			}

			public void onSuccess(ItemSer result) {
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
	protected void executeUpdate(final String requestId,
			final DSRequest request, final DSResponse response) {

	}

	@Override
	protected void executeRemove(final String requestId,
			final DSRequest request, final DSResponse response) {

	}

	private static void copyValues(ItemSer from, ListGridRecord to) {
		to.setAttribute(ClientConstants.ITEM_KEY, from.getKey());
		to.setAttribute(ClientConstants.ITEM_FROM, from.getFrom());
		to.setAttribute(ClientConstants.ITEM_TO, from.getTo());
	}

	private static void copyValues(ListGridRecord from, ItemSer to) {

		to.setKey(from.getAttributeAsString(ClientConstants.ITEM_KEY));
		to.setFrom(from.getAttributeAsString(ClientConstants.ITEM_FROM));
		to.setTo(from.getAttributeAsString(ClientConstants.ITEM_TO));
	}

}
