package homework.day09.test6;

public class SportStudent extends Student implements Sport {
    public SportStudent() {
    }

    public SportStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为" + getAge() + "岁叫 " + getName() + " 的学生在打篮球");
    }
}
