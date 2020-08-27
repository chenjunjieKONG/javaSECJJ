package homework.day11.checkpoint1.test4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        //创建SimpleDateFormat对象，并制定日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //调用SimpleDateFormat对象的parse方法
        Date date = df.parse("1999-05-14");
        //输出
        System.out.println(date);
    }
}
