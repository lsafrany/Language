package hu.safi.language.shared.serialized;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ItemSer extends ResultSer implements IsSerializable {
		
    private String key;    
        
    private String from;
    
    private String to;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	
}
