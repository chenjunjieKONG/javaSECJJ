package homework.day13.checkpoint2.test8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 创建Scanner对象,用于键盘录入
        Scanner scanner=new Scanner(System.in);
        // 创建HashSet.用于去除重复的数字
        HashSet<Integer> hashSet=new HashSet<>();
        // 不停循环,让用户输入数字

        while (true){
            // 调用Scanner的nextInt()方法,让用户输入一个数字
            int num=scanner.nextInt();
            if(num==-1){// 如果用户输入-1,跳出循环
                break;
            }else {// 不是-1将数字添加到HashSet
                hashSet.add(num);
            }
        }
        // 定义求和变量sum
        int sum=0;
        // 使用增强for获取HashSet中的每个元素
        for (Integer integer : hashSet) {
            sum+=integer;// 将每个数字添加到sum中
        }
        // 输出求和的结果
        System.out.println(sum);
        // 输出平均值,平均值 = 总数 / 个数
        int age=sum/hashSet.size();
        System.out.println(age);








    }
}
