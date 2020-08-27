package homework.day13.checkpoint1.test7;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj==null||getClass()!=obj.getClass())
            return false;
        Person person=(Person) obj;
        return age ==person.getAge()&& Objects.equals(getName(),person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getAge());
    }
}
