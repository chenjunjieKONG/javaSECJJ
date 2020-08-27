package homework.day09.test7;

public class Test1 {
    public static void main(String[] args) {
        Manager m = new Manager("张小强", 9000);
        Coder c = new Coder("李小亮", 5000);
        Company company = new Company(1000000);
        company.paySalary(m);
        company.paySalary(c);
    }
}
