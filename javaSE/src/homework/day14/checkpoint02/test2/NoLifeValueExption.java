package homework.day14.checkpoint02.test2;

public class NoLifeValueExption extends RuntimeException {
    public NoLifeValueExption() {
    }

    public NoLifeValueExption(String s) {
        super(s);
    }

    public NoLifeValueExption(String s, Throwable throwable) {
        super(s, throwable);
    }

    public NoLifeValueExption(Throwable throwable) {
        super(throwable);
    }

    public NoLifeValueExption(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
