package homework.day05.test6;

public class Coder {
    String name;
    int numder;
    int salary;

    public Coder() {

    }

    public Coder(String name, int numder, int salary) {
        this.name = name;
        this.numder = numder;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumder(int numder) {
        this.numder = numder;
    }

    public int getNumder() {
        return numder;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void intro() {
        System.out.println("程序员姓名：" + getName());
        System.out.println("工号：" + getNumder());
    }

    public void showSalary() {
        System.out.println("基本工资为" + getSalary() + ",奖金为无");
    }

    public void work() {
        System.out.println("正在努力写代码.....");
    }
}
