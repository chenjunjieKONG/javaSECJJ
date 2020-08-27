package homework.day09.test8;

public class Test1 {
    public static void main(String[] args) {
        GouWuChe gouWuChe = new GouWuChe();
        Laptop laptop = new Laptop("笔记本", "g10000", 10000);
        Phone phone = new Phone("手机", "g10001", 5000);
        Fruit fruit = new Fruit("苹果", "g20000", 50);
        System.out.println("=========添加商品========");
        gouWuChe.addGoods(laptop);
        gouWuChe.addGoods(phone);
        gouWuChe.addGoods(fruit);
        System.out.println("=========打印商品========");
        gouWuChe.showGoods();
        System.out.println("-----------------------");
        gouWuChe.total();
    }
}
