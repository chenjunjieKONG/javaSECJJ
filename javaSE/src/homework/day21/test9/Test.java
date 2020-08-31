package homework.day21.test9;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(Test.class.getResourceAsStream("/homework/day21/test9/inthf.properties"));
        show(properties);
    }
    public static void show(Properties properties) throws IOException {
        Set<String> set = properties.stringPropertyNames();
        for (String s : set) {
            if(properties.getProperty(s).equals("null")){
                properties.setProperty(s,"0");
            }
            int i=Integer.parseInt(properties.getProperty(s));
            OutputStream outputStream=new FileOutputStream("D:\\javaSECJJ\\javaSE\\src\\homework\\day21\\test9\\inthf.properties");
            if(i<3){
                properties.setProperty(s, String.valueOf(i+1));
                properties.store(outputStream,String.valueOf(i+1));
            }else {
                System.out.println("程序使用次数已满，请续费");
                break;
            }
            System.out.println(properties.getProperty(s));
        }
    }
}
