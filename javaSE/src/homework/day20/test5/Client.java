package homework.day20.test5;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端 发送数据");
        //创建 Socket ( ip , port ) , 确定连接到哪里.
        Socket socket=new Socket("localhost",8888);
        //获取流对象 . 输出流
        OutputStream outputStream=socket.getOutputStream();
        //写出数据.
        outputStream.write("hello,服务器,我是客户端".getBytes());
        //关闭资源
        outputStream.close();
        socket.close();
    }
}
