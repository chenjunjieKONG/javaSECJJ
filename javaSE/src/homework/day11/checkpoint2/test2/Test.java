package homework.day11.checkpoint2.test2;

public class Test {
    public static void main(String[] args) {
        String str = new String("a");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        StringBuilder str1 = new StringBuilder("a");
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str1.append("a");
        }
        long end1 = System.currentTimeMillis();
        System.out.println(end1 - start1);
    }
}
