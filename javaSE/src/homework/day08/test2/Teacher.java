package homework.day08.test2;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
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

    public void teach() {
        System.out.println(getName() + "上课");
    }
}
