package homework.day11.checkpoint3.test2;

import java.util.ArrayList;

public class Commodity {
    private String id;
    private String name;
    private double price;
    private String company;

    public Commodity() {
    }

    public Commodity(String id, String name, double price, String company) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.company = company;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void buy(ArrayList<Commodity> arrayList) {
        for (Commodity commodity : arrayList) {
            System.out.println(commodity.getId() + "\t\t" + commodity.getName() + "\t\t" + commodity.getPrice() + "\t" + commodity.getCompany());
        }
    }
}
