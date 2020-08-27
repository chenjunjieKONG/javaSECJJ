package homework.day08.test3;

public class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age, double price) {
        super(name, age, price);
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

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public void catchMouse() {
        System.out.println(getName() + "猫抓老鼠");
    }

}
