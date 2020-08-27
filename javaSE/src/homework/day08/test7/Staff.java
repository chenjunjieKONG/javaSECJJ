package homework.day08.test7;

public abstract class Staff {
    String id;
    String name;
    double wages;

    public Staff() {
    }

    public Staff(String id, String name, double wages) {
        this.id = id;
        this.name = name;
        this.wages = wages;
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

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public abstract void work();

    public abstract void eat();
}
