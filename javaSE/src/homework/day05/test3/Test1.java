package homework.day05.test3;

public class Test1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setContent("java面向对象的知识");
        teacher.setAge(30);
        teacher.setName("周老师");
        teacher.eat();
        teacher.teach();

        Student student = new Student("韩同学", 18, "java面向对象的知识");
        student.eat();
        student.study();
    }
}
