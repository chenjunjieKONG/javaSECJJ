package 练习.enums;

public enum SexEnum {
    MAN("男"),
    WOMAN("女");

    private String name;

    SexEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
