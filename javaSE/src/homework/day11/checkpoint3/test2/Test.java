package homework.day11.checkpoint3.test2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建输入对象
        Scanner scanner = new Scanner(System.in);
        //创建商品集合
        ArrayList<Commodity> goodsList = new ArrayList<>();
        //创建小票集合
        ArrayList<Settlement> arrayList = new ArrayList<>();
        //创建和添加商品到商品集合中
        Commodity commodity1 = new Commodity("001", "少林核桃", 15.5, "斤");
        Commodity commodity2 = new Commodity("002", "尚康饼干", 14.5, "斤");
        Commodity commodity3 = new Commodity("003", "移动硬盘", 345.0, "斤");
        Commodity commodity4 = new Commodity("004", "高清无码", 199.0, "斤");
        goodsList.add(commodity1);
        goodsList.add(commodity2);
        goodsList.add(commodity3);
        goodsList.add(commodity4);
        //创建死循环
        while (true) {
            System.out.println("请输入你要进行的操作：");
            System.out.println("1:购物商品          2.结算并打印小票           3.退出系统");
            //输入数字来决定你的操作
            int in = scanner.nextInt();
            //通过switch语句来执行操作
            switch (in) {
                //购买操作
                case 1:
                    System.out.println("-------------------------------------------");
                    System.out.println("             商品列表");
                    System.out.println("商品id\t" + "名称\t" + "\t\t单价\t" + "\t计价单位\t");
                    //创建商品对象
                    Commodity commodity = new Commodity();
                    //调用商品类中的方法
                    commodity.buy(goodsList);
                    System.out.println("-------------------------------------------");
                    System.out.println("请你输入您要购买的商品项(输入格式：商品id-购买数量),输入end表示购买结束");
                    //再次创建死循环
                    while (true) {
                        //定义一个布尔值
                        boolean flag = false;
                        //输入字符串
                        String str = scanner.next();
                        //输入end结束死循环
                        if (str.equals("end")) {
                            break;
                        }
                        //判断商品输入格式
                        if (str.indexOf("-") != -1) {
                            //把商品格式以“-”分割
                            String[] strArr = str.split("-");
                            //遍历商品集合
                            for (int i = 0; i < goodsList.size(); i++) {
                                //判断商品id是否正确
                                if (goodsList.get(i).getId().equals(strArr[0])) {
                                    //正确就布尔值就为true
                                    flag = true;
                                    //获取循环中的商品的集合元素
                                    commodity = goodsList.get(i);
                                }
                            }
                            //当布尔值为true的时候把商品的内容添加到结算对象中
                            if (flag == true) {
                                //创建结算的对象
                                Settlement settlement = new Settlement();
                                //把分割出来的数量添加给结算对象
                                settlement.setNum(Integer.parseInt(strArr[1]));
                                //把商品的名字添加到结算对象中
                                settlement.setName(commodity.getName());
                                //把商品的价格添加到结算对象中
                                settlement.setPrice(commodity.getPrice());
                                //把结算的对象添加到小票的集合中
                                arrayList.add(settlement);
                            }
                            //当布尔值为false中就提示
                            if (flag == false) {
                                System.out.println("您输入的id不存在，请重新输入！！");
                            }
                        } else {//输入格式不符合就提示
                            System.out.println("你输入的购买商品姿势不对,请换个姿势再来一次(格式：商品id-购买数量)");
                        }
                    }
                    System.out.println("购买结束");
                    break;
                case 2:
                    System.out.println("-------------------------------------------");
                    System.out.println("             欢迎光临");
                    System.out.println("名称\t" + "\t\t售价\t" + "\t数量\t" + "\t金额\t");
                    //调用结算方法
                    account(arrayList);
                    System.out.println("-------------------------------------------");
                    break;
                case 3:
                    System.out.println("感谢您使用超市的购物系统，欢迎下次光临，拜拜");
                    break;
                default:
                    System.out.println("你输入的操作有误！");
                    break;
            }
            if (in == 3) {
                break;
            }
        }
    }

    //定义结算方法
    public static void account(ArrayList<Settlement> list) {
        int sum = 0;
        double moyth = 0;
        for (Settlement se : list) {
            System.out.println(se.getName() + "\t\t" + se.getPrice() + "\t" + se.getNum() + "\t\t" + (se.getNum() * se.getPrice()));
            sum += se.getNum();
            moyth += (se.getNum() * se.getPrice());
        }
        System.out.println("-------------------------------------------");
        System.out.println(list.size() + "项商品");
        System.out.println("共计" + sum + "件");
        System.out.println("共" + moyth + "元");
    }
}
