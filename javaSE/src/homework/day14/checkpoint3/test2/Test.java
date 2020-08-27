package homework.day14.checkpoint3.test2;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        //已知Map中保存如下信息:{“及时雨”=”宋江”, “玉麒麟”=”卢俊义”, “智多星”=”吴用”}
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("及时雨", "宋江");
        hashMap.put("玉麒麟", "卢俊义");
        hashMap.put("智多星", "吴用");
        // 往Map中添加“入云龙”=”公孙胜”, ”豹子头”=”林冲”两位好汉
        hashMap.put("入云龙", "公孙胜");
        hashMap.put("豹子头", "林冲");
        // 删除“玉麒麟”=”卢俊义”
        hashMap.remove("玉麒麟");
        // 将key为“智多星”的value修改为null,
        hashMap.put("智多星", null);
        // 将“及时雨”=”宋江”,修改为”呼保义”=” 宋江”
        hashMap.put("呼保义", "宋江");
        hashMap.remove("及时雨");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
