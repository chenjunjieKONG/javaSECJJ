package homework.day21.test1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Calculator {
    @BeforeClass
    public static void init() {
        Calculator calculator=new Calculator();
        System.out.println("创建对象成功");
    }
    @Test
    public void add(){
        System.out.println("这是加法");
    }
    @Test
    public void subtract(){
        System.out.println("这是减法");
    }
    @Test
    public void multiply(){
        System.out.println("这是乘法");
    }
    @Test
    public void divide(){
        System.out.println("这是除法");
    }
    @AfterClass
    public static void ting() {
        Calculator calculator=null;
        System.out.println("对象赋值为空");
    }
}
