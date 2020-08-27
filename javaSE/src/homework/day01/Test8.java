package homework.day01;

public class Test8 {
    public static void main(String[] args){
        int i=32;
        char ch=(char)('J'+i);
        char ch2='a';
        ch2-=32;
        double d3=3.5;
        int i3=100;
        double sum3=d3+i3;
        double d4=70.1;
        int i4=5;
        int mul4=(int)(d4*i4);
        System.out.println(ch);
        System.out.println(ch2);
        System.out.println("sum3的值："+sum3);
        System.out.println("sum3的整数部分："+(int)(sum3));
        System.out.println("mul4的整数部分："+mul4);
    }
}
