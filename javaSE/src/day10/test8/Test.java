package day10.test8;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.stream().skip(2).forEach(n->{
            System.out.println(n);
        });
//        list.stream().limit(2).filter(n->{
//            return n.startsWith("张");
//        }).forEach(n->{
//            System.out.println(n);
//        });
//        list.stream().filter(n->{
//            return n.startsWith("张")&&n.length()==3;
//        }).collect(Collectors.toList()).forEach(System.out::println);
//        Stream<String> stream=list.stream();
//        stream.forEach((n)->{System.out.println(n);});
//        stream.forEach(System.out::println);
//        list.stream().filter(n->{
//            return n.length()==3;
//        }).collect(Collectors.toList()).forEach(System.out::println);
    }
}
