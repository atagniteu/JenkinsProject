package exceptions;

public class UncheckedException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UncheckedException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UncheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UncheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public UncheckedException(String message) {
		super(message);
	}

	public UncheckedException(Throwable cause) {
		super(cause);
	}
	

}
