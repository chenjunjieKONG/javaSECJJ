package day10.test2;

public class Test {
    public static void main(String[] args) {
        Car car=new Car();
        Car.Engine engine=car.new Engine();
        engine.run();
        Person person=new Person();
        person.eat();
    }
}
