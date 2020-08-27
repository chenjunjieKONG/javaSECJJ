package homework.day10.test4;

public class Test1 {
    public static void main(String[] args) {
        Apple a1 = new Apple(5, "青色");
        Apple a2 = new Apple(3, "红色");
        Worker worker = new Worker();
        System.out.println("默认挑选最大的：");
        Compare compare = new Compare();
        worker.pickApple(compare, a1, a2);
        System.out.println("挑红的：");
        worker.pickApple(new CompareAble() {
            @Override
            public Apple compare(Apple a1, Apple a2) {
                if (a1.getColor() == "红色") {
                    return a1;
                } else {
                    return a2;
                }
            }
        }, a1, a2);
    }
}
