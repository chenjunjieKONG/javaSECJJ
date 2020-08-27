package homework.day09.test6;

public class SportTeacher extends Teacher implements Sport {
    public SportTeacher() {
    }

    public SportTeacher(String name, int age) {
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
        System.out.println("年龄为" + getAge() + "岁 " + getName() + " 的老师在打篮球");

    }
}
