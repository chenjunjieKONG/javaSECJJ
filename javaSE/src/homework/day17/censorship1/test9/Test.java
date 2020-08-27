package homework.day17.censorship1.test9;

public class Test {
    public static void main(String[] args) {

        System.out.println(sum(100));
    }

    public static int sum(int num) {
        if (num == 1) {
            return 1;
        }
        return num + sum(num - 1);
    }
}
