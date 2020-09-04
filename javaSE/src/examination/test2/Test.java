package examination.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String s="abcdesldfsldflsadlsf";
        //截取字符串
        String[] split = s.split("");
        //定义ArrayList集合，用于存储字符串的每一个字符
        ArrayList<String> list=new ArrayList<>();
        //定义HashMap集合，用来存储并判断每个字符的数量
        HashMap<String,Integer> hashMap=new HashMap<>();
        //把截取字符串之后的数组添加到集合中
        list.addAll(Arrays.asList(split));
        //遍历ArrayList集合
        for (String str : list) {
            //判断HashMap集合里面是否存在这个键
            if(!hashMap.containsKey(str)){//不存在
                hashMap.put(str,1);//把value设置为1
            }else {//存在
                //就把value加1
                hashMap.put(str,hashMap.get(str)+1);
            }
        }
        //遍历HashMap集合并打印出来
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("字符："+entry.getKey()+",数量："+entry.getValue());
        }

    }
}
