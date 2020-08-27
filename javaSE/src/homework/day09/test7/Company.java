package homework.day09.test7;

public class Company implements Money {
    private double capital;

    public Company() {
    }

    public Company(double capital) {
        this.capital = capital;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    @Override
    public void paySalary(Employee emp) {
        capital-=emp.getSalary();
        System.out.println("给"+emp.getName()+"发工资"+emp.getSalary()+"元,公司剩余:"+capital+"元");
    }
}
