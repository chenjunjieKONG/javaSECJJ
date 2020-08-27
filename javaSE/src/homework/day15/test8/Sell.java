package homework.day15.test8;

public class Sell extends Thread{
    private static Integer num;
    private static Object object=new Object();
    public Sell() {
    }

    public Sell(String name) {
        super(name);
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true){
            synchronized (object){
                if(num<=0){
                    break;
                }
                System.out.println(getName()+"卖出一张票,剩余票数为"+(num-1));
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                num--;
            }
        }
    }
}
