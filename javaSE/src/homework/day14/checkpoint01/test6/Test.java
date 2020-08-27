package homework.day14.checkpoint01.test6;

public class Test {
    public static void main(String[] args) throws Exception {
        testThrows();
        testTryCarch();
    }

    // 提供一个静态方法:public static char charAt(String str, int index) 用于获取字符串str,index索引处的字符
    public static char charAt(String str, int index) throws Exception {
        if (str == null) {// 当字符串为null抛出 Exception("字符串不能为null")异常,
            throw new Exception("字符串不能为空");
        } else if (str == "") {// 当字符串为"" 的时候抛出Excetion("字符串不能为空") 异常;
            throw new Exception("字符串不能为空");
            // 当index不在 [0,str.length()-1] 之间的时,抛出Exception("索引越界") 异常.
        } else if (index > 0 && str.length() - 1 < index) {
            throw new Exception("索引越界");
        }
        // 否则返回str在index索引的字符
        return str.charAt(index);
    }

    // 提供一个静态的方法testThrows() 用于测试charAt(String,intindex)方法
    // 使用throws方式对异常进行处理
    public static void testThrows() throws Exception {
        charAt("", 3);
    }

    // 提供一个静态方法testTryCatch(),用于测试charAt(String,int index)方法
    // 在方法中调用charAt(String,int index)方法;
    public static void testTryCarch() {
        // 使用try...catch方式对异常进行处理
        try {
            charAt("", 3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
