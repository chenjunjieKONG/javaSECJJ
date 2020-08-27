package homework.day08.test5;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("王小平", 45, "java");
        teacher.lecture();
        Student student = new Student("李小乐", 18, 90);
        student.examination();
    }
}
