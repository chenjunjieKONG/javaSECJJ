package homework.day14.checkpoint2.test10;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        // 定义第一个数组arr1
        String[] arr1 = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        // 定义第二个数组arr2
        String[] arr2 = {"哈尔滨", "杭州", "南昌", "广州", "福州"};
        // 创建HashMap,key存放省,value存放市
        HashMap<String, String> hashMap = new HashMap<>();
        // 使用普通for循环遍历arr1
        for (int i = 0; i < arr1.length; i++) {
            // 根据索引到arr1中获取到省
            // 根据索引到arr2中获取到省会城市
            // 将省和省会城市添加到HashMap中
            hashMap.put(arr1[i], arr2[i]);
        }
        // 输出HashMap中的内容
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
