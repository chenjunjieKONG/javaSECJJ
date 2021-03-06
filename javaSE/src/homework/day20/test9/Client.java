package homework.day20.test9;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        System.out.println("客户端 发送数据");
        try {
            //创建客户端
            Socket socket=new Socket("localhost",8888);
            //创建输入流，用于读取服务器的文件
            BufferedInputStream inputStream=new BufferedInputStream(socket.getInputStream());
            //创建输出流，用于写入文件
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("D:/ccc.png"));
            //读取文件
            byte[]bytes=new byte[1024];
            int len;
            while ((len=inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,len);//写入文件
            }
            //关闭资源
            outputStream.close();
            inputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
