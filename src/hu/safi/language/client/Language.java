package hu.safi.language.client;

import hu.safi.language.client.datasource.ItemDataSource;
import hu.safi.language.client.datasource.SubThemeDataSource;
import hu.safi.language.client.datasource.ThemeDataSource;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.smartgwt.client.data.Criteria;
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
import com.smartgwt.client.widgets.events.ClickEvent;
import com.smartgwt.client.widgets.events.ClickHandler;
import com.smartgwt.client.widgets.grid.ListGrid;
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

	private String translate = "";
	
	public void onModuleLoad() {
		
        RootPanel p = RootPanel.get("loadingWrapper");
        if (p != null) RootPanel.getBodyElement().removeChild(p.getElement());

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
                	if (response.getAttribute(ClientConstants.ERROR) != null) SC.warn(response.getAttribute(ClientConstants.ERROR)); 
        		}
                else {
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
		subThemeGrid.setTitle(ClientLabels.SUBTHEME);
		subThemeGrid.setShowAllRecords(true);  		
 
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
                	if (response.getAttribute(ClientConstants.ERROR) != null) SC.warn(response.getAttribute(ClientConstants.ERROR)); 
        		}
                else {
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
		
		mainLayout.draw ();

		themeGrid.addRecordClickHandler(new RecordClickHandler() {   
            public void onRecordClick(RecordClickEvent event) {
            	Criteria criteria = new Criteria();
            	String themeKey = event.getRecord().getAttributeAsString(ClientConstants.THEME_KEY);
            	criteria.addCriteria(ClientConstants.THEME_KEY,themeKey);
            	subThemeGrid.fetchData(criteria);
            }
        });   

		subThemeGrid.addRecordClickHandler(new RecordClickHandler() {   
            public void onRecordClick(RecordClickEvent event) {
            	 listButton.setDisabled(false);
            	 testButton.setDisabled(false);
             }
        });   

	
	    listButton.addClickHandler(new ClickHandler() {  
	    	public void onClick(ClickEvent event) {
	    		if (subThemeGrid.getSelectedRecord() != null) {
	    			list(mainLayout,subThemeGrid.getSelectedRecord().getAttributeAsString(ClientConstants.SUBTHEME_KEY));
	    		}		
  	    	}	
        });         	    	    	 

	    testButton.addClickHandler(new ClickHandler() {  
	    	public void onClick(ClickEvent event) {
	    		if (subThemeGrid.getSelectedRecord() != null) {
	    			test(mainLayout,subThemeGrid.getSelectedRecord().getAttributeAsString(ClientConstants.SUBTHEME_KEY));
	    		}		
  	    	}	
        });         	    	    	 

	    return mainLayout;
	}

	public void list (final HLayout mainLayout,String subTheme) {
		
		mainLayout.removeMembers(mainLayout.getMembers());
		
		final ListGrid itemGrid = new ListGrid();
		itemGrid.setWidth("90%");
		itemGrid.setHeight("80%");
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
                	if (response.getAttribute(ClientConstants.ERROR) != null) SC.warn(response.getAttribute(ClientConstants.ERROR)); 
        		}
                else {
                	DisplayRequest.serverResponse();
                	super.transformResponse(response, request, data);
                }  	
            }   
        };   	
        
		itemGrid.setDataSource(itemDataSource);   			
		Criteria criteria = new Criteria();
		criteria.addCriteria(ClientConstants.SUBTHEME_KEY,subTheme);
    	itemGrid.fetchData(criteria);
		
		VLayout buttonLayout = new VLayout();
		buttonLayout.setWidth("10%");
		buttonLayout.setDefaultLayoutAlign(Alignment.CENTER);
		buttonLayout.setAlign(VerticalAlignment.CENTER);
		
	    final IButton backButton = new IButton(ClientLabels.BUTTON_BACK);	 
	    buttonLayout.addMember(backButton);
    	    	
		mainLayout.addMember(itemGrid);	
		mainLayout.addMember(buttonLayout);
		
	    backButton.addClickHandler(new ClickHandler() {  
	    	public void onClick(ClickEvent event) {
	    		mainLayout.removeMembers(mainLayout.getMembers());
	    		onModuleLoad();
  	    	}	
        });         	    	    	 
				
	}

	public void test (final HLayout mainLayout,final String subTheme) {
		
		mainLayout.removeMembers(mainLayout.getMembers());
		
		final ListGrid itemGrid = new ListGrid();
		itemGrid.setWidth("90%");
		itemGrid.setHeight("20%");
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
                	if (response.getAttribute(ClientConstants.ERROR) != null) SC.warn(response.getAttribute(ClientConstants.ERROR)); 
        		}
                else {
                	DisplayRequest.serverResponse();
                	super.transformResponse(response, request, data);
                }  	
            }   
        };   	
        
		itemGrid.setDataSource(itemDataSource);   			
		Criteria criteria = new Criteria();
		criteria.addCriteria(ClientConstants.SUBTHEME_KEY,subTheme);
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
				for (int i=0;i<itemGrid.getRecords().length;i++) {										
					itemGrid.getRecord(i).setAttribute(ClientConstants.ITEM_TO,translate);					
				}	
				itemGrid.redraw();
				translateButton.setDisabled(true);
  	    	}	
        });      
	    
	    testButton.addClickHandler(new ClickHandler() {  
	    	public void onClick(ClickEvent event) {
	    		Criteria criteria = new Criteria();
	    		criteria.addCriteria(ClientConstants.SUBTHEME_KEY,subTheme);
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
				for (int i=0;i<itemGrid.getRecords().length;i++) {										
					translate = itemGrid.getRecord(i).getAttributeAsString(ClientConstants.ITEM_TO);	
					itemGrid.getRecord(i).setAttribute(ClientConstants.ITEM_TO,"");
				}
				translateButton.setDisabled(false);
				testButton.setDisabled(false);
			}
		});	    

	}

}
