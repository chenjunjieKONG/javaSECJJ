package homework.day03;

public class Test8 {
    public static void main(String[] args) {
        double huaS=86.0;
        double sheS=30.0;
        System.out.println("摄氏度为："+sheS+"°--华氏度为："+huaS(sheS)+"°");
        System.out.println("华氏度为："+huaS+"°--摄氏度为："+sheS(huaS)+"°");
    }
    //摄氏度转换华氏度
    public static double huaS(double num) {
        return (9.0 / 5) * num + 32;
    }
    //华氏度转换摄氏度
    public static double sheS(double num) {
        return (num - 32) / (9.0 / 5);
    }
}
