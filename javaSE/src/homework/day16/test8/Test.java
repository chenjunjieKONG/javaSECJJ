package homework.day16.test8;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student[] students = {
                new Student("小明", 70),
                new Student("小天", 60),
                new Student("小白", 80),
                new Student("小红", 90),
        };
        Arrays.sort(students,(a,b)->b.getScore()-a.getScore());
        for (Student student : students) {
            System.out.println(student.getName()+","+student.getScore());
        }
    }
}
