package homework.day09.test7;

public class Coder extends Employee {
    public Coder() {
    }

    public Coder(String name, double salary) {
        super(name, salary);
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
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }
}
