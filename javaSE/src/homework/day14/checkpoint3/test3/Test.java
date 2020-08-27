package homework.day14.checkpoint3.test3;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 给每种水果设定一个商品号，商品号是8个0-9的随机数，商品号码不能重复。
        HashSet<String> hashSet = new HashSet();
        Random random = new Random();
        while (hashSet.size() < 4) {
            String sum = "";
            for (int i = 0; i < 8; i++) {
                int num = random.nextInt(10);
                sum += num;
            }
            hashSet.add(sum);
        }
        HashMap<String, String> hashMap = new HashMap();
        String[] strArr = {"苹果", "香蕉", "西瓜", "橘子"};
        int i = 0;
        for (String s : hashSet) {
            hashMap.put(s, strArr[i]);
            i++;
        }
        System.out.println(hashMap);
        // 根据商品号查询对应的商品。
        String s = new Scanner(System.in).next();
        for (String str : hashMap.keySet()) {
            //如果能查到打印：”根据商品号：12345678，查询到对应的商品为：西瓜”
            if (str.contains(s)) {
                System.out.println("根据商品号：" + s + ",查询到对应的商品为：" + hashMap.get(str));
                break;
            } else {
                //如果查不到输出：“查无此商品”
                System.out.println("根据商品号：" + s + ",查无此商品");
                break;
            }
        }
    }
}
