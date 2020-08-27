package homework.day11.checkpoint1.test5;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
        //获取当前日历对象
        Calendar calendar = Calendar.getInstance();
        //调用日期的add()方法，让当前日历向后移动500天
        calendar.add(Calendar.DAY_OF_MONTH, 500);
        int year = calendar.get(Calendar.YEAR);//年
        int month = calendar.get(Calendar.MARCH) + 1;//月
        int day = calendar.get(Calendar.DAY_OF_MONTH);//日
        //输出
        System.out.println(year + "年" + month + "月" + day + "日");
    }
}
