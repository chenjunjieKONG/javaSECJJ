package homework.day05.test6;

public class Manager {
    String name;
    int numder;
    int salary;
    int bonus;

    public Manager() {

    }

    public Manager(String name, int numder, int salary, int bonus) {
        this.name = name;
        this.numder = numder;
        this.salary = salary;
        this.bonus = bonus;
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

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void intro() {
        System.out.println("经理名字：" + getName());
        System.out.println("工号：" + getNumder());
    }

    public void showSalary() {
        System.out.println("基本工资为" + getSalary() + ",奖金为" + getBonus());
    }

    public void work() {
        System.out.println("正在努力的做着管理工作，分配任务，检查员工提交上来的代码.....");
    }
}
