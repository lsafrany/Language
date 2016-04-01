package hu.safi.language.server.jdo;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class SubTheme {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
	private Key theme;

	@Persistent
	private String name;

	@Persistent
	private String lang;

	@Persistent
	private String order;

	public SubTheme(Key theme, String name, String lang, String order) {
		this.theme = theme;
		this.name = name;
		this.lang = lang;
		this.order = order;
	}

	public Key getKey() {
		return key;
	}

	public Key getTheme() {
		return theme;
	}

	public void setTheme(Key theme) {
		this.theme = theme;
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
