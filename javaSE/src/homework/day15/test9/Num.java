package homework.day15.test9;

public class Num extends Thread {
    private int num;

    public Num(String s, int num) {
        super(s);
        this.num = num;
    }

    @Override
    public void run() {
        int sum=1;
        for (int i = 1; i <= num; i++) {
            sum*=i;
            System.out.println(getName()+":"+sum);
        }
    }
}
