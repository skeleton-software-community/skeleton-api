package org.sklsft.commons.api.exception;

/**
 * This RuntimeException is used to be handled by several aspects<br>
 * It overrides the message to enable the serialization/deserialization using setters as required in json serialization for instance
 * 
 * @author Nicolas Thibault
 *
 */
public abstract class ApplicationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public static final String ERROR_UNKNOWN = "error.unknown";
	
	private String message;
	

	public ApplicationException(){
		super();
	}
	
	public ApplicationException(String message) {
		super(message);
		this.message = message;

	}

	public ApplicationException(String message, Throwable cause) {
		super(message, cause);
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}