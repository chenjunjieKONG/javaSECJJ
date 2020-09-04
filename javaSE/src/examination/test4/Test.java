package examination.test4;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        //获取文件
        File file = new File("D:/test/a.txt");
        BufferedInputStream bis=null;
        BufferedOutputStream bos=null;
        try {
            //获取缓冲字节输入流，用于读取
            bis = new BufferedInputStream(new FileInputStream(file));
            //获取缓冲字节输出流，用于写入
            bos = new BufferedOutputStream(new FileOutputStream(
                    "D:/test2/" + System.currentTimeMillis() + "abc.txt"));
            //读取
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);//写入
                bos.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭资源
            if(bis!=null){
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bos!=null){
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
