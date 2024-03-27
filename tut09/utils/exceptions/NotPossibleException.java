package tut09.utils.exceptions;

public class NotPossibleException extends RuntimeException {
    public NotPossibleException() {
        super();
    }

    public NotPossibleException(String message) {
        super(message);
    }

    public NotPossibleException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotPossibleException(Throwable cause) {
        super(cause);
    }
}
