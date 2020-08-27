package homework.day20.test4;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端 发送数据");
        //创建 Socket ( ip , port ) , 确定连接到哪里.
        Socket socket=new Socket("127.0.0.1", 8888);
        //获取流对象 . 输出流
        OutputStream os = socket.getOutputStream();
        //写出数据.
        os.write("你好！".getBytes());
        //关闭资源
        os.close();
        socket.close();
    }
}
