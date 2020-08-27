package homework.day16.test4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Take take1 = new Take(10);
        Take take2 = new Take(5);
        Take take3 = new Take(8);
        service.submit(take1);
        service.submit(take2);
        service.submit(take3);
    }
}
