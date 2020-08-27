package 练习;

import java.util.*;

public class T1 {
    public static void main(String[] args) {
        //牌集合
        HashMap<Integer, String> cardsMap = new HashMap<>();
        //用来存储牌的编号
        ArrayList<Integer> numCards = new ArrayList<>();
        //花牌
        ArrayList<String> flower = new ArrayList<>();
        //字牌
        ArrayList<String> wordPlate = new ArrayList<>();
        Collections.addAll(flower, "♠", "♥", "♣", "♦");
        Collections.addAll(wordPlate, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        //整理牌集合
        int count = 1;
        cardsMap.put(count++, "大王");
        cardsMap.put(count++, "小王");
        for (String word : wordPlate) {
            for (String flow : flower) {
                cardsMap.put(count++, flow + word);
            }
        }
        // 取出编号 集合
        Set<Integer> num = cardsMap.keySet();
        //把Set集合转换成list集合
        numCards.addAll(num);
        //洗牌
        Collections.shuffle(numCards);
        //定义玩家的牌编号集合
        ArrayList<Integer> oneCards = new ArrayList<>();
        ArrayList<Integer> twoCards = new ArrayList<>();
        ArrayList<Integer> threeCards = new ArrayList<>();
        ArrayList<Integer> base = new ArrayList<>();
        //发牌
        for (int i = 0; i < numCards.size(); i++) {
            if (i >= 51) {
                base.add(numCards.get(i));
            } else if (i % 3 == 0) {
                oneCards.add(numCards.get(i));
            } else if (i % 3 == 1) {
                twoCards.add(numCards.get(i));
            } else if (i % 3 == 2) {
                threeCards.add(numCards.get(i));
            }
        }
        //排序
        Collections.sort(oneCards);
        Collections.sort(twoCards);
        Collections.sort(threeCards);
        Collections.sort(base);
        //定义玩家的牌集合和底牌
        ArrayList<String> newOneCards = new ArrayList<>();
        ArrayList<String> newTwoCards = new ArrayList<>();
        ArrayList<String> newThreeCards = new ArrayList<>();
        ArrayList<String> newBase = new ArrayList<>();
        //把编号通过hashMap集合转换成牌
        transition(oneCards, newOneCards, cardsMap);
        transition(twoCards, newTwoCards, cardsMap);
        transition(threeCards, newThreeCards, cardsMap);
        transition(base, newBase, cardsMap);
        //输出
        System.out.println("第一位玩家：" + newOneCards);
        System.out.println("第二位玩家：" + newTwoCards);
        System.out.println("第三位玩家：" + newThreeCards);
        System.out.println("底牌：" + newBase);
    }

    public static void transition(ArrayList<Integer> arrayList,
                                  ArrayList<String> list,
                                  HashMap<Integer, String> hashMap) {
        for (Integer integer : arrayList) {
            list.add(hashMap.get(integer));
        }
    }
    public static void landlord(){
        while (true){

        }
    }
}
