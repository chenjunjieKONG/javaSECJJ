package day10.test4;

public class Test {
    public static void main(String[] args) {
        Swin s1=new Swin() {
            @Override
            public void swimming() {
                System.out.println("狗刨式");
            }
        };
        Swin s2=new Swin() {
            @Override
            public void swimming() {
                System.out.println("蛙泳");
            }
        };
        s(s1);
        s(s2);
    }
    public static void s(Swin swin){
        swin.swimming();
    }
}
