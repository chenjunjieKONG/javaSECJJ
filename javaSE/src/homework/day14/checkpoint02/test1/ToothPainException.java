package homework.day14.checkpoint02.test1;

public class ToothPainException extends PainExecption {
    public ToothPainException() {
    }

    public ToothPainException(String s) {
        super(s);
    }

    public ToothPainException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ToothPainException(Throwable throwable) {
        super(throwable);
    }

    public ToothPainException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
