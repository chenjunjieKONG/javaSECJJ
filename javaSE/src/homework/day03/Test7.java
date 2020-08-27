package homework.day03;

public class Test7 {
    public static void main(String[] args) {
        System.out.println("10.1->" + round(10.1));
        System.out.println("10.2->" + round(10.2));
        System.out.println("10.3->" + round(10.3));
        System.out.println("10.4->" + round(10.4));
    }
    public static int round(double num) {
        return (int) (num + 0.5);
    }
}
