package homework.day16.test3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Avg avg = new Avg();
        System.out.println("平均数：" + service.submit(avg).get());
        System.out.println("平均数：" + service.submit(avg).get());
        System.out.println("平均数：" + service.submit(avg).get());

    }
}
