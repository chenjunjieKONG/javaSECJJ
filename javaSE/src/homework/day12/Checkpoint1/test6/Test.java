package homework.day12.Checkpoint1.test6;

public class Test {
    public static void main(String[] args) {
        function("abc");
        function(123);
    }

    public static <M> void function(M t) {
        System.out.println(t);
    }
}
