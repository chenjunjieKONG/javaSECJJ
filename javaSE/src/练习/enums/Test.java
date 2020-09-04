package 练习.enums;

public class Test {
    public static void main(String[] args) {
        String sex="女";
        if(SexEnum.MAN.getName().equals(sex)){
            System.out.println(sex);
        }else if(SexEnum.WOMAN.getName().equals(sex)){
            System.out.println(sex);
        }else {
            System.out.println("格式不正确");
        }
    }
}
