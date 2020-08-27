package homework.day14.checkpoint02.test1;

public class FrontToothPainExcption extends ToothPainException {
    public FrontToothPainExcption() {
    }

    public FrontToothPainExcption(String s) {
        super(s);
    }

    public FrontToothPainExcption(String s, Throwable throwable) {
        super(s, throwable);
    }

    public FrontToothPainExcption(Throwable throwable) {
        super(throwable);
    }

    public FrontToothPainExcption(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
