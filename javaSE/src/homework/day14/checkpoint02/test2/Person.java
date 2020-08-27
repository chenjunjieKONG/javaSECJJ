package homework.day14.checkpoint02.test2;

public class Person {
    private String name;
    private int lifeValue;

    public Person() {
    }

    public Person(String name, int lifeValue) {
        setName(name);
        setLifeValue(lifeValue);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if (lifeValue < 0) {
            throw new NoLifeValueExption("生命值不能为负数:" + lifeValue);
        }
        this.lifeValue = lifeValue;
    }
}
