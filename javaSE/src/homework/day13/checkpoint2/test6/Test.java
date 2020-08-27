package homework.day13.checkpoint2.test6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // 创建HashSet用于保存随机数
        HashSet<Integer> hashSet = new HashSet<>();
        // 创建Random用于产生随机数
        Random random = new Random();
        // 使用while循环判断hs的size是否小于10
        while (hashSet.size() < 10) {// hs的size小于10就生成一个随机数
            // 将随机数添加到HashSet,重复的随机数HashSet不会添加
            hashSet.add(random.nextInt(20) + 1);
        }
        // 获取迭代器
        Iterator<Integer> it = hashSet.iterator();
        // 使用迭代器循环判断是否有下一个元素
        while (it.hasNext()) {
            System.out.println(it.next());// 获取到下一个元素.打印出来
        }
    }
}
