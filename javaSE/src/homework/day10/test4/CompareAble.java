package homework.day10.test4;

public interface CompareAble {
    default Apple compare(Apple a1, Apple a2) {
        return a1.getSize() > a2.getSize() ? a1 : a2;
    }
}
