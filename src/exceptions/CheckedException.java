package exceptions;

import java.io.IOException;
/**
 * 
 * @author muriel 
 * @since 2018
 * 
 *
 */

public class CheckedException extends IOException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CheckedException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public CheckedException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public CheckedException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
