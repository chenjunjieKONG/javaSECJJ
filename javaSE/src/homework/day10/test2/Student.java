package homework.day10.test2;

public class Student {
    private String name;
    private String attendance;

    public Student() {
    }

    public Student(String name, String attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }
}
