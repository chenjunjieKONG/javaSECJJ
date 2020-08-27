package homework.day14.checkpoint02.test3;

public class LoginException extends Exception {
    public LoginException() {
    }

    public LoginException(String s) {
        super(s);
    }

    public LoginException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public LoginException(Throwable throwable) {
        super(throwable);
    }

    public LoginException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
