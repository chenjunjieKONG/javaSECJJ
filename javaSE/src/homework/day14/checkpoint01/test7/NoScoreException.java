package homework.day14.checkpoint01.test7;

public class NoScoreException extends RuntimeException {
    public NoScoreException() {
    }

    public NoScoreException(String s) {
        super(s);
    }

    public NoScoreException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public NoScoreException(Throwable throwable) {
        super(throwable);
    }

    public NoScoreException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
