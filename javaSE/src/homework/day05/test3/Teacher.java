package homework.day05.test3;

public class Teacher {
    String name;
    int age;
    String content;

    public Teacher() {

    }

    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void eat() {
        System.out.println("年龄为" + getAge() + getName() + "正在吃饭....");
    }

    public void teach() {
        System.out.println("年龄为" + getAge() + getName() + "正在亢奋的讲着" + getContent() + "....");
    }
}
