package homework.day20.test4;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动 , 等待连接 .... ");
        //创建 ServerSocket对象，绑定端口，开始等待连接
        ServerSocket server = new ServerSocket(8888);
        //接收连接 accept 方法, 返回 socket 对象.
        Socket socket = server.accept();
        //通过socket 获取输入流
        InputStream inputStream = socket.getInputStream();
        //一次性读取数据
        byte[] bytes = new byte[1024];
        //据读取到字节数组中.
        int len=inputStream.read(bytes);
        //解析数组,打印字符串信息
        System.out.println(new String(bytes, 0, len));
        inputStream.close();
        socket.close();

    }
}
