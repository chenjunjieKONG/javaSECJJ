package homework.day14.checkpoint02.test1;

public class TonguePainException extends PainExecption {
    public TonguePainException() {
    }

    public TonguePainException(String s) {
        super(s);
    }

    public TonguePainException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public TonguePainException(Throwable throwable) {
        super(throwable);
    }

    public TonguePainException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
