package day10.test7;

public class Test {
    public static void main(String[] args) {
//        Start start=new Start(new Task() {
//            @Override
//            public void work() {
//                System.out.println("搬砖了");
//            }
//        });
//        start.run();
//
        //
        new Start(()->{
            System.out.println("搬砖了");
            System.out.println("我想喝可乐");
        }).run();
    }
}
