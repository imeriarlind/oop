package session19.exception;

public class StudentException extends RuntimeException {
  public StudentException(final String message) {
    super(message);
  }

  public StudentException(final Throwable cause) {
    super(cause);
  }
}
