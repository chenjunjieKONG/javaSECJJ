package homework.day13.checkpoint3.test1;

import java.util.HashSet;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        //创建HashSet集合
        HashSet<String> hashSet=new HashSet<>();
        //随机数
        Random random=new Random();
        //循环判断集合是否小于7
        while (hashSet.size()<7){
            if(hashSet.size()<7){//蓝色球
                if(hashSet.size()==6){
                    hashSet.add("蓝色"+(random.nextInt(16)+1));
                }else {//红色球
                    hashSet.add("红色"+(random.nextInt(33)+1));
                }
            }
        }
        System.out.println(hashSet);
    }
}
