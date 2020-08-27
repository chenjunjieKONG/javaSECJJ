package homework.day10.test1;

public class Test1 {
    public static void main(String[] args) {
        new HandleAble() {
            @Override
            public void HandleString(String num) {
                double a = Double.parseDouble(num);
                System.out.println("原数字:" + num);
//                System.out.println("取整后："+Integer.parseInt(num.split("\\.")[0]));
                System.out.println("取整后：" + (int) a);
                System.out.println("保留4位小数后：" + (String.format("%.4f", a)));
            }
        }.HandleString("23.23456789");
    }
}
