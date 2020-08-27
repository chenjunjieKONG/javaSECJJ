package homework.day08.test5;

public class Student extends Person {
    private int fraction;

    public Student() {
    }

    public Student(String name, int age, int fraction) {
        super(name, age);
        this.fraction = fraction;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    public void setFraction(int fraction) {
        this.fraction = fraction;
    }

    public int getFraction() {
        return fraction;
    }

    public void examination() {
        System.out.println(getName() + "同学,考试得了：" + getFraction() + "分");
    }
}
