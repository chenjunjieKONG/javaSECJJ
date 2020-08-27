package homework.day13.checkpoint1.test10;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list=add("a", "f", "b", "c", "a", "d");
        for (String s : list) {
            System.out.println(s);
        }
    }
    public static ArrayList add(String... str){
        ArrayList<String> list=new ArrayList<>();
        for (String s : str) {
            list.add(s);
        }
        return list;
    }
}
