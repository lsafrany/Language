package hu.safi.language.server.jdo;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;

@PersistenceCapable
public class Item {

	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Key key;

	@Persistent
	private Key subtheme;

	@Persistent
	private String from;

	@Persistent
	private String to;

	public Item(Key subtheme, String from, String to) {
		this.subtheme = subtheme;
		this.from = from;
		this.to = to;
	}

	public Key getKey() {
		return key;
	}

	public Key getSubtheme() {
		return subtheme;
	}

	public void setSubtheme(Key subtheme) {
		this.subtheme = subtheme;
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
