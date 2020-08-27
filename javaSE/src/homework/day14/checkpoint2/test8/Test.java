package homework.day14.checkpoint2.test8;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        // 创建键盘输入对象
        Scanner scanner = new Scanner(System.in);
        // 创建随机数对象
        Random random = new Random();
        // 创建HashMap集合key存放姓名,value存放成绩
        HashMap<String, Integer> hashMap = new HashMap<>();
        // 循环判断HashMap中数量是否小于5
        while (hashMap.size() < 5) {
            // 如果HashMap中数量小于5,让用户再输入一个姓名
            String name = scanner.nextLine();
            // 使用随机数生成一个成绩
            int score = random.nextInt(100) + 1;
            // 将姓名和分数添加到HashMap中
            hashMap.put(name, score);
        }
        // 使用迭代器获取一个键
        Iterator<String> integer = hashMap.keySet().iterator();
        String s = integer.next();
        // 通过键找到对应的分数,作为默认分数
        int num = hashMap.get(s);
        // 定义总分分变量
        int sum = 0;
        // 定义最高分变量=默认分数
        int max = num;
        // 定义最低分变量=默认分数
        int min = num;
        // 使用keySet获取到所有的key
        Set<String> set = hashMap.keySet();
        // 使用增强for遍历所有的key
        for (String str : set) {
            // 根据key找到对应的value
            int score = hashMap.get(str);
            // 将这个分数添加到总分
            sum += score;
            // 如果最高分小于这个分数,让最高分=这个分数
            if (max < score) {
                max = score;
            }
            // 如果最低分大于这个分数,让最低分=这个分数
            if (min > score) {
                min = score;
            }
        }
        // 计算平均分
        int avg = sum / hashMap.size();
        // 输出结果
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("总分：" + sum);
        System.out.println("最高分：" + max);
        System.out.println("最低分：" + min);
        System.out.println("平均分：" + avg);
    }
}
