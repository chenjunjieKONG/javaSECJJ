package homework.day05.test5;

public class Circle {
    int r;
    double p = 3.14;

    public Circle() {

    }

    public Circle(int r) {
        this.r = r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void showArea() {
        double area = r * r * p;
        System.out.println("半径为：" + getR() + ",面积为：" + area);
    }

    public void showPerimeter() {
        double perimeter = r * 2 * p;
        System.out.println("半径为：" + getR() + ",周长为：" + perimeter);
    }
}
