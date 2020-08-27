package homework.day09.test5;

public class Test1 {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.eat();
        Animal c = new Cat();
        c.eat();
        getO(d);
        getO(c);
    }

    public static void getO(Animal animal) {
        if (animal instanceof Dog) {
            Dog a = (Dog) animal;
            a.lookHome();
        } else if (animal instanceof Cat) {
            Cat a = (Cat) animal;
            a.catchMouse();
        }
    }
}
