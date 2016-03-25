package hu.safi.language.client;

import hu.safi.language.client.datasource.ItemDataSource;
import hu.safi.language.client.datasource.SubThemeDataSource;
import hu.safi.language.client.datasource.ThemeDataSource;
import hu.safi.language.shared.Constants;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.data.Criteria;
import com.smartgwt.client.data.DSCallback;
import com.smartgwt.client.data.DSRequest;
import com.smartgwt.client.data.DSResponse;
import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.rpc.RPCResponse;
import com.smartgwt.client.types.Alignment;
import com.smartgwt.client.types.VerticalAlignment;
import com.smartgwt.client.util.SC;
import com.smartgwt.client.widgets.Canvas;
import com.smartgwt.client.widgets.IButton;
import com.smartgwt.client.widgets.Label;
import com.smartgwt.client.widgets.Window;
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.form.DynamicForm;
import com.smartgwt.client.widgets.form.fields.PasswordItem;
import com.smartgwt.client.widgets.grid.ListGrid;
import com.smartgwt.client.widgets.grid.ListGridField;
import com.smartgwt.client.widgets.grid.events.DataArrivedEvent;
import com.smartgwt.client.widgets.grid.events.DataArrivedHandler;
import com.smartgwt.client.widgets.grid.events.RecordClickEvent;
import com.smartgwt.client.widgets.grid.events.RecordClickHandler;
import com.smartgwt.client.widgets.layout.HLayout;
import com.smartgwt.client.widgets.layout.VLayout;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Language implements EntryPoint {

	private final LanguageServiceAsync languageService = GWT.create(LanguageService.class);

	private String translate = "";

	private boolean add = false;

	public void onModuleLoad() {

		RootPanel p = RootPanel.get("loadingWrapper");
		if (p != null)
			RootPanel.getBodyElement().removeChild(p.getElement());

		RootPanel.get().clear();
		RootPanel.get().add(getViewPanel());
	}

	public Canvas getViewPanel() {

		final HLayout mainLayout = new HLayout();
		mainLayout.setTitle("Language");
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		mainLayout.setDefaultLayoutAlign(Alignment.CENTER);
		mainLayout.setAlign(VerticalAlignment.CENTER);
		mainLayout.setMargin(20);

		final ListGrid themeGrid = new ListGrid();
		themeGrid.setWidth("40%");
		themeGrid.setHeight("80%");
		themeGrid.setBaseStyle("largerText");
		themeGrid.setTitle(ClientLabels.THEME);
		themeGrid.setShowAllRecords(true);

		final DataSource themeDataSource = new ThemeDataSource() {
			@Override
			protected Object transformRequest(DSRequest dsRequest) {
				DisplayRequest.processStart();
				return super.transformRequest(dsRequest);
			}

			@Override
			protected void transformResponse(DSResponse response, DSRequest request, Object data) {
				if (response.getStatus() == RPCResponse.STATUS_FAILURE || response.getAttribute(ClientConstants.ERROR) != null) {
					DisplayRequest.serverError();
					if (response.getAttribute(ClientConstants.ERROR) != null)
						SC.warn(response.getAttribute(ClientConstants.ERROR));
				} else {
					DisplayRequest.serverResponse();
					super.transformResponse(response, request, data);
				}
			}
		};

		themeGrid.setDataSource(themeDataSource);
		themeGrid.setAutoFetchData(true);

		final ListGrid subThemeGrid = new ListGrid();
		subThemeGrid.setWidth("40%");
		subThemeGrid.setHeight("80%");
		subThemeGrid.setBaseStyle("largerText");
		subThemeGrid.setTitle(ClientLabels.SUBTHEME);
		subThemeGrid.setShowAllRecords(true);

		ListGridField nameGridField = new ListGridField(
				ClientConstants.SUBTHEME_NAME);
		ListGridField langGridField = new ListGridField(
				ClientConstants.SUBTHEME_LANG);
		langGridField.setWidth("30%");

		subThemeGrid.setFields(nameGridField,langGridField);
		
		final DataSource subThemeDataSource = new SubThemeDataSource() {
			@Override
			protected Object transformRequest(DSRequest dsRequest) {
				DisplayRequest.processStart();
				return super.transformRequest(dsRequest);
			}

			@Override
			protected void transformResponse(DSResponse response, DSRequest request, Object data) {
				if (response.getStatus() == RPCResponse.STATUS_FAILURE || response.getAttribute(ClientConstants.ERROR) != null) {
					DisplayRequest.serverError();
					if (response.getAttribute(ClientConstants.ERROR) != null)
						SC.warn(response.getAttribute(ClientConstants.ERROR));
				} else {
					DisplayRequest.serverResponse();
					super.transformResponse(response, request, data);
				}
			}
		};

		subThemeGrid.setDataSource(subThemeDataSource);

		VLayout buttonsLayout = new VLayout();
		buttonsLayout.setWidth("20%");
		buttonsLayout.setDefaultLayoutAlign(Alignment.CENTER);
		buttonsLayout.setAlign(VerticalAlignment.CENTER);

		final IButton addthemaButton = new IButton(ClientLabels.ADD_THEME);
		if (add)
			addthemaButton.show();
		else
			addthemaButton.hide();
		buttonsLayout.addMember(addthemaButton);

		Label addthemaemptyLabel = new Label("&nbsp;&nbsp");
		buttonsLayout.addMember(addthemaemptyLabel);

		final IButton addsubthemaButton = new IButton(ClientLabels.ADD_SUBTHEME);
		if (add)
			addsubthemaButton.show();
		else
			addsubthemaButton.hide();
		addsubthemaButton.setDisabled(true);
		buttonsLayout.addMember(addsubthemaButton);

		Label addsubthemaemptyLabel = new Label("&nbsp;&nbsp");
		buttonsLayout.addMember(addsubthemaemptyLabel);

		final IButton codeButton = new IButton(ClientLabels.CODE);
		if (add)
			codeButton.hide();
		else
			codeButton.show();
		buttonsLayout.addMember(codeButton);

		Label codeemptyLabel = new Label("&nbsp;&nbsp");
		buttonsLayout.addMember(codeemptyLabel);

		final IButton listButton = new IButton(ClientLabels.BUTTON_LIST);
		listButton.setDisabled(true);
		buttonsLayout.addMember(listButton);

		Label emptyLabel = new Label("&nbsp;&nbsp");
		buttonsLayout.addMember(emptyLabel);

		final IButton testButton = new IButton(ClientLabels.BUTTON_TEST);
		testButton.setDisabled(true);
		buttonsLayout.addMember(testButton);

		mainLayout.addMember(themeGrid);
		mainLayout.addMember(subThemeGrid);
		mainLayout.addMember(buttonsLayout);

		mainLayout.draw();

		themeGrid.addRecordClickHandler(new RecordClickHandler() {
			public void onRecordClick(RecordClickEvent event) {
				Criteria criteria = new Criteria();
				String themeKey = event.getRecord().getAttributeAsString(ClientConstants.THEME_KEY);
				criteria.addCriteria(ClientConstants.THEME_KEY, themeKey);
				subThemeGrid.fetchData(criteria);
				addsubthemaButton.setDisabled(false);
				listButton.setDisabled(true);
				testButton.setDisabled(true);
			}
		});

		subThemeGrid.addRecordClickHandler(new RecordClickHandler() {
			public void onRecordClick(RecordClickEvent event) {
				listButton.setDisabled(false);
				testButton.setDisabled(false);
				addsubthemaButton.setDisabled(false);
			}
		});

		codeButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				codeCheck(codeButton, addthemaButton, addsubthemaButton);
			}
		});

		addthemaButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				additem(1, themeDataSource);
			}
		});

		addsubthemaButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				additem(2, subThemeDataSource);
			}
		});

		listButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (subThemeGrid.getSelectedRecord() != null) {
					list(mainLayout, subThemeGrid.getSelectedRecord().getAttributeAsString(ClientConstants.SUBTHEME_KEY),
							subThemeGrid.getSelectedRecord().getAttributeAsString(ClientConstants.SUBTHEME_LANG));
				}
			}
		});

		testButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				if (subThemeGrid.getSelectedRecord() != null) {
					test(mainLayout, subThemeGrid.getSelectedRecord().getAttributeAsString(ClientConstants.SUBTHEME_KEY),
							subThemeGrid.getSelectedRecord().getAttributeAsString(ClientConstants.SUBTHEME_LANG));
				}
			}
		});

		return mainLayout;
	}

	void codeCheck(final IButton addButton, final IButton addthemaButton, final IButton addsubthemaButton) {
		final Window winModal = new Window();
		winModal.setWidth(300);
		winModal.setHeight(120);
		winModal.setTitle(ClientLabels.CODE);
		winModal.setShowMinimizeButton(false);
		winModal.setShowCloseButton(false);
		winModal.setIsModal(true);
		winModal.setShowModalMask(true);
		winModal.centerInPage();

		HLayout emptyLayout = new HLayout();
		emptyLayout.setWidth100();
		emptyLayout.setHeight("20%");

		final DynamicForm codeForm = new DynamicForm();
		codeForm.setHeight("40%");
		codeForm.setNumCols(2);
		codeForm.setColWidths("30%", "*");

		final PasswordItem codeItem = new PasswordItem();
		codeItem.setTitle(ClientLabels.CODE);
		codeItem.setLength(15);
		codeItem.setRequired(true);

		codeForm.setFields(codeItem);

		HLayout labelLayout = new HLayout();
		labelLayout.setWidth100();
		labelLayout.setAlign(Alignment.CENTER);
		labelLayout.setDefaultLayoutAlign(VerticalAlignment.CENTER);
		labelLayout.setHeight("20%");

		final Label label = new Label();
		label.setAlign(Alignment.CENTER);
		label.setStyleName("error");
		labelLayout.addMember(label);

		HLayout buttonsLayout = new HLayout();
		buttonsLayout.setWidth100();
		buttonsLayout.setHeight("20%");
		buttonsLayout.setAlign(Alignment.CENTER);
		buttonsLayout.setDefaultLayoutAlign(VerticalAlignment.CENTER);

		HLayout cancelLayout = new HLayout();
		cancelLayout.setDefaultLayoutAlign(VerticalAlignment.CENTER);
		cancelLayout.setAlign(Alignment.CENTER);

		final IButton cancelIButton = new IButton(ClientLabels.CANCEL);
		cancelIButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				winModal.destroy();
			}
		});

		HLayout okLayout = new HLayout();
		okLayout.setDefaultLayoutAlign(VerticalAlignment.CENTER);
		okLayout.setAlign(Alignment.CENTER);
		final IButton okIButton = new IButton(ClientLabels.OK);

		okIButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				DisplayRequest.processStart();
				label.setContents("");
				cancelIButton.setDisabled(true);
				okIButton.setDisabled(true);
				languageService.codecheck(codeItem.getValueAsString(), new AsyncCallback<String>() {
					public void onFailure(Throwable caught) {
						DisplayRequest.serverResponse();
						label.setContents(ClientLabels.ERROR);
						cancelIButton.setDisabled(false);
						okIButton.setDisabled(false);
					}

					public void onSuccess(String result) {
						DisplayRequest.serverResponse();
						if (result.equals("TRUE")) {
							add = true;
							addButton.hide();
							addthemaButton.show();
							addsubthemaButton.show();
							winModal.destroy();
						} else {
							label.setContents(ClientLabels.CODE_ERROR);
							cancelIButton.setDisabled(false);
							okIButton.setDisabled(false);
						}
					}
				});
			}
		});

		cancelLayout.addMember(cancelIButton);
		buttonsLayout.addMember(cancelLayout);

		okLayout.addMember(okIButton);
		buttonsLayout.addMember(okLayout);

		winModal.addItem(emptyLayout);
		winModal.addItem(codeForm);
		winModal.addItem(labelLayout);
		winModal.addItem(buttonsLayout);
		winModal.show();

	}

	void additem(final int mode, final DataSource dataSource) {
		final Window winModal = new Window();
		if (mode == 1) {
			winModal.setWidth(500);
			winModal.setHeight(120);
		}
		else if (mode == 2) {
			winModal.setWidth(500);
			winModal.setHeight(200);
		}
		else if (mode == 3) {
			winModal.setWidth(500);
			winModal.setHeight(220);
		}
		winModal.setTitle(ClientLabels.CODE);
		winModal.setShowMinimizeButton(false);
		winModal.setShowCloseButton(false);
		winModal.setIsModal(true);
		winModal.setShowModalMask(true);
		winModal.centerInPage();

		HLayout emptyLayout = new HLayout();
		emptyLayout.setWidth100();
		emptyLayout.setHeight("20%");

		final DynamicForm editForm = new DynamicForm();
		editForm.setNumCols(2);
		editForm.setColWidths("15%", "*");
		editForm.setDataSource(dataSource);
		editForm.setUseAllDataSourceFields(true);

		editForm.editNewRecord();

		HLayout labelLayout = new HLayout();
		labelLayout.setWidth100();
		labelLayout.setAlign(Alignment.CENTER);
		labelLayout.setDefaultLayoutAlign(VerticalAlignment.CENTER);
		labelLayout.setHeight("20%");

		final Label label = new Label();
		label.setAlign(Alignment.CENTER);
		label.setStyleName("error");
		labelLayout.addMember(label);

		HLayout buttonsLayout = new HLayout();
		buttonsLayout.setWidth100();
		buttonsLayout.setHeight("20%");
		buttonsLayout.setAlign(Alignment.CENTER);
		buttonsLayout.setDefaultLayoutAlign(VerticalAlignment.CENTER);

		HLayout cancelLayout = new HLayout();
		cancelLayout.setDefaultLayoutAlign(VerticalAlignment.CENTER);
		cancelLayout.setAlign(Alignment.CENTER);

		final IButton cancelIButton = new IButton(ClientLabels.CANCEL);
		cancelIButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				winModal.destroy();
			}
		});

		HLayout okLayout = new HLayout();
		okLayout.setDefaultLayoutAlign(VerticalAlignment.CENTER);
		okLayout.setAlign(Alignment.CENTER);
		final IButton okIButton = new IButton(ClientLabels.OK);

		okIButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				editForm.saveData(new DSCallback() {
					public void execute(DSResponse response, Object rawData, DSRequest request) {
						if (response.getStatus() == DSResponse.STATUS_SUCCESS)
							winModal.destroy();
					}
				});
			}
		});

		cancelLayout.addMember(cancelIButton);
		buttonsLayout.addMember(cancelLayout);

		okLayout.addMember(okIButton);
		buttonsLayout.addMember(okLayout);

		winModal.addItem(emptyLayout);
		winModal.addItem(editForm);
		winModal.addItem(labelLayout);
		winModal.addItem(buttonsLayout);
		winModal.show();

	}

	void list(final HLayout mainLayout, final String subTheme, final String lang) {

		mainLayout.removeMembers(mainLayout.getMembers());

		final ListGrid itemGrid = new ListGrid();
		itemGrid.setWidth("90%");
		itemGrid.setHeight("80%");
		itemGrid.setBaseStyle("largerText");
		itemGrid.setTitle(ClientLabels.ITEM);
		itemGrid.setShowAllRecords(false);

		final DataSource itemDataSource = new ItemDataSource(true) {
			@Override
			protected Object transformRequest(DSRequest dsRequest) {
				DisplayRequest.processStart();
				return super.transformRequest(dsRequest);
			}

			@Override
			protected void transformResponse(DSResponse response, DSRequest request, Object data) {
				if (response.getStatus() == RPCResponse.STATUS_FAILURE || response.getAttribute(ClientConstants.ERROR) != null) {
					DisplayRequest.serverError();
					if (response.getAttribute(ClientConstants.ERROR) != null)
						SC.warn(response.getAttribute(ClientConstants.ERROR));
				} else {
					DisplayRequest.serverResponse();
					super.transformResponse(response, request, data);
				}
			}
		};

		itemGrid.setDataSource(itemDataSource);
		Criteria criteria = new Criteria();
		criteria.addCriteria(ClientConstants.SUBTHEME_KEY, subTheme);
		itemGrid.fetchData(criteria);

		VLayout buttonLayout = new VLayout();
		buttonLayout.setWidth("10%");
		buttonLayout.setDefaultLayoutAlign(Alignment.CENTER);
		buttonLayout.setAlign(VerticalAlignment.CENTER);

		final IButton addButton = new IButton(ClientLabels.ADD);
		if (add)
			addButton.show();
		else
			addButton.hide();
		buttonLayout.addMember(addButton);

		Label emptyLabel = new Label("&nbsp;&nbsp");
		buttonLayout.addMember(emptyLabel);

		final IButton printButton = new IButton(ClientLabels.BUTTON_PRINT);
		buttonLayout.addMember(printButton);

		Label empty1Label = new Label("&nbsp;&nbsp");
		buttonLayout.addMember(empty1Label);

		final IButton backButton = new IButton(ClientLabels.BUTTON_BACK);
		buttonLayout.addMember(backButton);

		mainLayout.addMember(itemGrid);
		mainLayout.addMember(buttonLayout);

		addButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				additem(3, itemDataSource);
			}
		});

		printButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Canvas.showPrintPreview(mainLayout);
			}
		});

		backButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				mainLayout.removeMembers(mainLayout.getMembers());
				onModuleLoad();
			}
		});

		itemGrid.addRecordClickHandler(new RecordClickHandler() {
			public void onRecordClick(RecordClickEvent event) {
				if (lang.equals(Constants.EN)) {
					speach_en_female(event.getRecord().getAttributeAsString(ClientConstants.ITEM_TO));
				}
			}
		});

	}
	
	void test(final HLayout mainLayout, final String subTheme, final String lang) {

		mainLayout.removeMembers(mainLayout.getMembers());

		final ListGrid itemGrid = new ListGrid();
		itemGrid.setWidth("90%");
		itemGrid.setHeight("20%");
		itemGrid.setBaseStyle("largerText");
		itemGrid.setTitle(ClientLabels.ITEM);
		itemGrid.setShowAllRecords(false);

		final DataSource itemDataSource = new ItemDataSource(false) {
			@Override
			protected Object transformRequest(DSRequest dsRequest) {
				DisplayRequest.processStart();
				return super.transformRequest(dsRequest);
			}

			@Override
			protected void transformResponse(DSResponse response, DSRequest request, Object data) {
				if (response.getStatus() == RPCResponse.STATUS_FAILURE || response.getAttribute(ClientConstants.ERROR) != null) {
					DisplayRequest.serverError();
					if (response.getAttribute(ClientConstants.ERROR) != null)
						SC.warn(response.getAttribute(ClientConstants.ERROR));
				} else {
					DisplayRequest.serverResponse();
					super.transformResponse(response, request, data);
				}
			}
		};

		itemGrid.setDataSource(itemDataSource);
		Criteria criteria = new Criteria();
		criteria.addCriteria(ClientConstants.SUBTHEME_KEY, subTheme);
		itemGrid.fetchData(criteria);

		VLayout buttonsLayout = new VLayout();
		buttonsLayout.setWidth("10%");
		buttonsLayout.setDefaultLayoutAlign(Alignment.CENTER);
		buttonsLayout.setAlign(VerticalAlignment.CENTER);

		final IButton translateButton = new IButton(ClientLabels.BUTTON_TRANSLATE);
		translateButton.setDisabled(true);
		buttonsLayout.addMember(translateButton);

		Label emptyLabel1 = new Label("&nbsp;&nbsp");
		buttonsLayout.addMember(emptyLabel1);

		final IButton testButton = new IButton(ClientLabels.BUTTON_TEST);
		testButton.setDisabled(true);
		buttonsLayout.addMember(testButton);

		Label emptyLabel2 = new Label("&nbsp;&nbsp");
		buttonsLayout.addMember(emptyLabel2);

		Label emptyLabel3 = new Label("&nbsp;&nbsp");
		buttonsLayout.addMember(emptyLabel3);

		final IButton backButton = new IButton(ClientLabels.BUTTON_BACK);
		buttonsLayout.addMember(backButton);

		mainLayout.addMember(itemGrid);
		mainLayout.addMember(buttonsLayout);

		translateButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				for (int i = 0; i < itemGrid.getRecords().length; i++) {
					itemGrid.getRecord(i).setAttribute(ClientConstants.ITEM_TO, translate);
				}
				itemGrid.redraw();
				translateButton.setDisabled(true);
				if (lang.equals(Constants.EN)) {
					speach_en_female(translate);
				}
			}
		});

		testButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Criteria criteria = new Criteria();
				criteria.addCriteria(ClientConstants.SUBTHEME_KEY, subTheme);
				itemGrid.invalidateCache();
				itemGrid.fetchData(criteria);
				translateButton.setDisabled(true);
				testButton.setDisabled(true);
			}
		});

		backButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				mainLayout.removeMembers(mainLayout.getMembers());
				onModuleLoad();
			}
		});

		itemGrid.addDataArrivedHandler(new DataArrivedHandler() {
			public void onDataArrived(DataArrivedEvent event) {
				for (int i = 0; i < itemGrid.getRecords().length; i++) {
					translate = itemGrid.getRecord(i).getAttributeAsString(ClientConstants.ITEM_TO);
					itemGrid.getRecord(i).setAttribute(ClientConstants.ITEM_TO, "");
				}
				translateButton.setDisabled(false);
				testButton.setDisabled(false);
			}
		});

	}

	public static native void speach_en_female(String speachto) /*-{
		$wnd.responsiveVoice.speak(speachto,"UK English Female");
	}-*/;

}
