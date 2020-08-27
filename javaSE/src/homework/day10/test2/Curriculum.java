package homework.day10.test2;

import java.util.ArrayList;

public class Curriculum {
    String name;
    Teacher teather;
    ArrayList<Student> students;

    public Curriculum() {
        teather = new Teacher();
        students = new ArrayList<>();
    }

    public Curriculum(String name, Teacher teather, ArrayList<Student> students) {
        this.name = name;
        this.teather = teather;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeather() {
        return teather;
    }

    public void setTeather(Teacher teather) {
        this.teather = teather;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void show() {
        System.out.println("课程名称:" + getName());
        System.out.println("授课老师:" + getTeather().getName());
        for (int i = 0; i < getStudents().size(); i++) {
            if (getStudents().get(i).getAttendance() == "出勤") {
                System.out.println("上课：" + getStudents().get(i).getName());
            } else {
                System.out.println("旷课：" + getStudents().get(i).getName());

            }
        }
    }
}
