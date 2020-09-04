package examination.test1;

public class Test {
    public static void main(String[] args) {
        System.out.println(order(5));
    }
    public static int order(int num){
        if(num==1){
            return 1;
        }
        return num*order(num-1);
    }
}
