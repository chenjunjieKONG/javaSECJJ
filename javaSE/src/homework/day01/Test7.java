package homework.day01;

public class Test7 {
    public static void main(String[] args){
        add(200,100);//和
        sub(200,100);//差
        mul(200,100);//积
        div(200,100);//商
        remain(200,100);//余数
    }
    public static void add(int x,int y){//和
        int num=x+y;
        System.out.println("x,y的和为："+num);
    }
    public static void sub(int x,int y){//差
        int num=x-y;
        System.out.println("x,y的差为："+num);
    }
    public static void mul(int x,int y){//积
        int num=x*y;
        System.out.println("x,y的积为："+num);
    }
    public static void div(int x,int y){//商
        int num=x/y;
        System.out.println("x,y的商为："+num);
    }
    public static void remain(int x,int y){//余数
        int num=x%y;
        System.out.println("x,y的余数为："+num);
    }
}
