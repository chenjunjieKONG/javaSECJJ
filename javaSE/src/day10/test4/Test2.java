package day10.test4;

public class Test2 {
    public static void main(String[] args) {
        getSwim().swimming();
    }
    public static Swin getSwim(){
        Swin swin=new SwimTeacher();
        return swin;
    }
}
