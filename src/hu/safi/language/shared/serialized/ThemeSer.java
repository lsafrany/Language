package hu.safi.language.shared.serialized;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ThemeSer extends ResultSer implements IsSerializable {
		
    private String key;    
    
    private String name;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
  
}
