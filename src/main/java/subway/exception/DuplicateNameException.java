package subway.exception;

public class DuplicateNameException extends RuntimeException {
    public DuplicateNameException(String msg) {
        super(msg);
    }
}
