package homework.day10.test2;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("张老师");
        Student student = new Student("小红", "出勤");
        Student student1 = new Student("小亮", "出勤");
        Student student2 = new Student("小明", "未出勤");
        ArrayList<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        Curriculum curriculum = new Curriculum("java", teacher, list);
        teacher.call(list);
        curriculum.show();
    }
}
