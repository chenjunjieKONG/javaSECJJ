package homework.day11.checkpoint3.test2;

import java.util.Objects;

public class Settlement {

    private String name;
    private double price;
    private int num;

    public Settlement() {
    }

    public Settlement(String name, double price, int num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
