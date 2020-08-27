package homework.day08.test2;

public class Coder extends Person {
    public Coder() {
    }

    public Coder(String name, int age) {
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

    public void coding() {
        System.out.println(getName() + "敲代码");
    }
}
