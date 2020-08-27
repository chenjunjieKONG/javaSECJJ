package homework.day14.checkpoint03.test1;

public class Abnormal extends Exception {
    public Abnormal() {
    }

    public Abnormal(String s) {
        super(s);
    }

    public Abnormal(String s, Throwable throwable) {
        super(s, throwable);
    }

    public Abnormal(Throwable throwable) {
        super(throwable);
    }

    public Abnormal(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
