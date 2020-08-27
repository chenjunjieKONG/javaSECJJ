package homework.day16.test4;

public class Take implements Runnable {
    private int num;

    public Take() {
    }

    public Take(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        System.out.println(getNum() + "的乘阶：" + sum);
    }
}
