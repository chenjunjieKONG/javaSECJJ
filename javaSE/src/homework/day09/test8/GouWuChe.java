package homework.day09.test8;

import java.util.ArrayList;

public class GouWuChe {
    private ArrayList<Goods> list = new ArrayList<>();

    public GouWuChe() {
//        list=new ArrayList<>();
    }

    public GouWuChe(ArrayList<Goods> arrayList) {
        this.list = arrayList;
    }

    public ArrayList<Goods> getList() {
        return list;
    }

    public void setList(ArrayList<Goods> arrayList) {
        this.list = arrayList;
    }

    public void addGoods(Goods goods) {
        getList().add(goods);
        System.out.println("加入 " + goods.getName() + " 成功");
    }

    public void showGoods() {
        System.out.println("您选购的商品为：");
        for (int i = 0; i < getList().size(); i++) {
            System.out.println("\t" + getList().get(i).getId() + ","
                    + getList().get(i).getName() + ","
                    + getList().get(i).getPrice());
        }
    }

    public void total() {
        double sum = 0;
        double sum1 = 0;
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i) instanceof Phone) {
                Phone t = (Phone) getList().get(i);
                sum1 += t.getPrice() * 0.88;
            } else if (getList().get(i) instanceof Laptop) {
                Laptop t1 = (Laptop) getList().get(i);
                sum1 += t1.getPrice() * 0.88;
            } else {
                Fruit t2 = (Fruit) getList().get(i);
                sum1 += t2.getPrice();
            }
            sum += getList().get(i).getPrice();
        }
        System.out.println("原价为：" + sum + "元");
        System.out.println("折后价为：" + sum1 + "元");

    }
}
