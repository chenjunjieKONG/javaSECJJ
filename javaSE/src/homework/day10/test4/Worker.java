package homework.day10.test4;

public class Worker {
    public Apple pickApple(CompareAble compareAble,Apple a1,Apple a2){
        Apple a=compareAble.compare(a1, a2);
        System.out.println(a.getSize()+"-"+a.getColor());
        return a;
    }
}
