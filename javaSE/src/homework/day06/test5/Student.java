package homework.day06.test5;

public class Student {
    private String id;
    private String name;
    private double height;

    public Student() {
    }

    public Student(String id, String name, double height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
