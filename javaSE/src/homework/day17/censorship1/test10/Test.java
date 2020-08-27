package homework.day17.censorship1.test10;

public class Test {
    public static void main(String[] args) {
        System.out.println(take(8));
    }
    public static int take(int num){
        if (num==1){
            return 1;
        }
        return num*take(num-1);
    }
}
