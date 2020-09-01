package 练习.ting;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        System.out.println("客户端 发送数据");
        //模拟多个客户端同时请求连接服务器端（假如1秒有10000次请求...）
        for (int i = 1; i <= 10; i++) {
            Socket socket = new Socket("localhost", 8888);
            OutputStream os = socket.getOutputStream();
            os.write(("hello" + i).getBytes());
            os.close();
            socket.close();
        }
    }
}
