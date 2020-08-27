package homework.day11.checkpoint2.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        //字符串
        String str="1999-05-14";
        //创建SimpleDateFormat对象，并制定日期格式
        SimpleDateFormat birthday=new SimpleDateFormat("yyyy-MM-dd");
        //调用SimpleDateFormat对象的parse方法
        Date newBirthday=birthday.parse(str);
        //获取日期对象
        Date date=new Date();
        //获取生日毫秒
        long birthdaySecond=newBirthday.getTime();
        //获取现在时间毫秒
        long nowSecond=date.getTime();
        //获取现在时间毫秒减去生日毫秒，得到活的时间毫秒
        long second=nowSecond-birthdaySecond;
        //转换为天数并输出
        System.out.println("我活了"+second/1000/60/60/24+"天");
    }
}
