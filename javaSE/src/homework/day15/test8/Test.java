package homework.day15.test8;

public class Test {
    public static void main(String[] args) {
        Sell sell1=new Sell("窗口a");
        sell1.setNum(20);
        Sell sell2=new Sell("窗口b");
        Sell sell3=new Sell("窗口c");
        Sell sell4=new Sell("窗口d");
        sell1.start();
        sell2.start();
        sell3.start();
        sell4.start();
    }
}
