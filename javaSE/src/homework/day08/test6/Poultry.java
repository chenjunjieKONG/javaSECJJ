package homework.day08.test6;

public abstract class Poultry {
    private int age;
    private String color;

    public Poultry() {
    }

    public Poultry(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void eat();
}
