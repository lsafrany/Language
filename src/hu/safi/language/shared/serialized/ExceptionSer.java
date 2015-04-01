package hu.safi.language.shared.serialized;

import com.google.gwt.user.client.rpc.IsSerializable;

@SuppressWarnings("serial")
public class ExceptionSer extends Exception implements IsSerializable {

	String message;

	public ExceptionSer() {
	}

	public ExceptionSer(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
