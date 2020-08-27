package homework.day08.test6;

public class Duck extends Poultry {
    public Duck(){}
    public Duck(int age,String color){
        super(age,color);
    }
    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在吃饭");
    }
    public void swimming(){
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在游泳");
    }
}
