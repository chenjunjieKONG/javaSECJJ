package homework.day03;

public class Test9 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                num = i * j;
                System.out.print(j + "*" + i + "=" + num + "\t");
            }
            System.out.println();
        }
    }

}
