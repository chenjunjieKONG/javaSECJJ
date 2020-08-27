package homework.day11.checkpoint3.test1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        //字符串
        String str = "2016-12-18";
        //创建SimpleDateFormat对象，并制定日期格式
        DateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
        //调用SimpleDateFormat对象的parse方法
        Date date = sp.parse(str);
//        String str1=sp.format(date);
//        System.out.println(str1);
        //通过applyPattern来改变日期格式
        ((SimpleDateFormat) sp).applyPattern("yyyy年MM月dd日");
        //调用SimpleDateFormat对象的format(Date date)方法
        String str2 = sp.format(date);
        //输出
        System.out.println(str2);
    }
}
