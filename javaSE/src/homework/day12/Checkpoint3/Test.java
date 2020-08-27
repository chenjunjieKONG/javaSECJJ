package homework.day12.Checkpoint3;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        //牌盒
        ArrayList<String> cardList = new ArrayList<>();
        //花牌
        ArrayList<String> flowerList = new ArrayList<>();
        //数字牌
        ArrayList<String> numList = new ArrayList<>();
        //添加花牌
        flowerList.add("♠");
        flowerList.add("♥");
        flowerList.add("♣");
        flowerList.add("♦");
        //添加数字牌
        for (int i = 2; i <= 10; i++) {
            numList.add(i + "");
        }
        numList.add("A");
        numList.add("J");
        numList.add("Q");
        numList.add("K");
        //遍历集合，把花牌和数字牌组成扑克牌并添加到牌盒里面
        for (String flower : flowerList) {
            for (String num : numList) {
                String car = flower + num;
                cardList.add(car);
            }
        }
        //添加大王和小王到牌盒中
        cardList.add("大王");
        cardList.add("小王");
        System.out.println(cardList);
        //洗牌
        Collections.shuffle(cardList);
        System.out.println(cardList);
        //定义三个玩家集合
        ArrayList<String> oneList = new ArrayList<>();
        ArrayList<String> twoList = new ArrayList<>();
        ArrayList<String> threeList = new ArrayList<>();
        //定义底牌集合
        ArrayList<String> detroit = new ArrayList<>();
        //通过遍历发牌
        for (int i = 0; i < cardList.size(); i++) {
            String cards = cardList.get(i);
            if (i >= 51) {
                detroit.add(cards);
            } else if (i % 3 == 0) {
                oneList.add(cards);
            } else if (i % 3 == 1) {
                twoList.add(cards);
            } else if (i % 3 == 2) {
                threeList.add(cards);
            }
        }
        System.out.println("第一位玩家：" + oneList);
        System.out.println("第二位玩家：" + twoList);
        System.out.println("第三位玩家：" + threeList);
        System.out.println("底牌：" + detroit);
        System.out.println("第一位玩家：" + landlord(oneList, detroit));
        System.out.println("第二位玩家：" + landlord(twoList, detroit));
        System.out.println("第三位玩家：" + landlord(threeList, detroit));
    }

    //判断谁有大王就谁是地主
    public static ArrayList<String> landlord(ArrayList<String> array, ArrayList<String> detroit) {
        if (array.contains("大王")) {
            for (String det : detroit) {
                array.add(det);
            }
        }
        return array;
    }
}
