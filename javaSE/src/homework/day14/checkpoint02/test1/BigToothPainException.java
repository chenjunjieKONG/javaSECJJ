package homework.day14.checkpoint02.test1;

public class BigToothPainException extends ToothPainException {
    public BigToothPainException() {
    }

    public BigToothPainException(String s) {
        super(s);
    }

    public BigToothPainException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public BigToothPainException(Throwable throwable) {
        super(throwable);
    }

    public BigToothPainException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
