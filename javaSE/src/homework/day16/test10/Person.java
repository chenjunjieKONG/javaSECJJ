package homework.day16.test10;

public class Person {
    private int count=1;
    private String name;
    private String gander;

    public Person() {
    }

    public Person(String name, String gander) {
        this.name = name;
        this.gander = gander;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) throws Exception {
        if(!(gander=="男"||gander=="女")){
            throw new Exception();
        }
        this.gander = gander;
    }
}
