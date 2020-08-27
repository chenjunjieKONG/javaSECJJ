package homework.day10.test2;

import java.util.ArrayList;

public class Teacher {
    String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void call(ArrayList<Student> student) {
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i).getName() + "今日" + student.get(i).getAttendance());
        }

    }
}
