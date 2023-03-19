package projects.exception;

@SuppressWarnings("serial")
public class DbException extends RuntimeException {

	public DbException() {

	}

	public DbException(String message) {}

	public DbException(Throwable cause) {}

	public DbException(String message, Throwable cause) {}

}
