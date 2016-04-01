package hu.safi.language.shared.serialized;

import com.google.gwt.user.client.rpc.IsSerializable;

public class SubThemeSer extends ResultSer implements IsSerializable {

	private String key;

	private String name;

	private String lang;
	
	private String order;

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

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

}

