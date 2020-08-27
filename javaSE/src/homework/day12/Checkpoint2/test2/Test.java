package homework.day12.Checkpoint2.test2;


import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //创建ArrayList
        ArrayList<String> coll = new ArrayList<>();
        //添加元素
        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("c");
        coll.add("a");
        coll.add("b");
        coll.add("b");
        coll.add("b");
        coll.add("a");
        //在main中调用这个方法测试
        System.out.println("字符出现的次数为：" + frequency(coll, "b"));
    }

    //定义frequency方法统计集合中指定元素出现的次数，
    public static int frequency(ArrayList arr, String key) {
        int count = 0;//在frequency方法中计数变量
        //在frequency方法中使用增强for遍历传入的ArrayList集合.拿到每个元素
        for (Object o : arr) {
            if (o.equals(key)) {
                count++;//如果遍历出来的元素是要查找的元素.计数器加1
            }
        }
        return count;//返回计数值
    }
}
