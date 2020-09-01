package homework.day20.test7;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        InputStream is=null;
        try {
            System.out.println("客户端 发送数据");
            //创建客户端
            Socket socket = new Socket("localhost", 8888);
            Scanner scanner = new Scanner(System.in);
            //键盘写入文件名
            String s = scanner.nextLine();
            //创建缓冲字节输出流用于读取文件
            bis = new BufferedInputStream(new FileInputStream(s));
            //
            //创建缓冲字节输出流用于写入文件到客户端
            bos = new BufferedOutputStream(socket.getOutputStream());
            //读取文件
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0, len);//写入文件
                bos.flush();//刷新缓存
            }
            System.out.println("文件发送完毕");
            //读取服务端回写的信息
            is = socket.getInputStream();
            byte[] b = new byte[1024];
            int i = is.read(b);
            System.out.println(new String(b, 0, i));
            //关闭资源
            is.close();
            bos.close();
            bis.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
