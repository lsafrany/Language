package hu.safi.language.shared.serialized;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ThemeSer extends ResultSer implements IsSerializable {

	private String key;

	private String name;

	private String order;
	
	private String mode;
	
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

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

}
