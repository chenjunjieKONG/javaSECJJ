package homework.day11.checkpoint1.test3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        //获取日期对象
        Date date = new Date();
        //创建SimpleDateFormat对象，并制定日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //调用SimpleDateFormat对象的format(Date date)方法
        String now = df.format(date);
        System.out.println(now);
    }
}
