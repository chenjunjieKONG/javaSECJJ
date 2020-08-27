package homework.day14.checkpoint02.test1;

public class PainExecption extends Exception {
    public PainExecption() {
    }

    public PainExecption(String s) {
        super(s);
    }

    public PainExecption(String s, Throwable throwable) {
        super(s, throwable);
    }

    public PainExecption(Throwable throwable) {
        super(throwable);
    }

    public PainExecption(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
