package homework.day09.test4;

public class OldPhone {
    private String name;

    public OldPhone(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void call() {
        System.out.println(getName() + "打电话");
    }

    public void sendMessage() {
        System.out.println(getName() + "发短信");
    }
}
