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

	public SubTheme(Key theme, String name) {
		this.theme = theme;
		this.name = name;
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

}
