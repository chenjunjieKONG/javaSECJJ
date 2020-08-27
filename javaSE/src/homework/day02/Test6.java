package homework.day02;

public class Test6 {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;//个位
            int shi = i / 10 % 10;//十位
            int bai = i / 100;//百位
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println("水仙花数：" + i);
            }
        }
    }
}
