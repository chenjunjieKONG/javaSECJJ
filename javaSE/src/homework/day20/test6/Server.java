package homework.day20.test6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动 , 等待连接 .... ");
        Scanner scanner = new Scanner(System.in);
        //创建服务器端
        ServerSocket serverSocket = new ServerSocket(8888);
        //创建输入字符流读取数据
        Socket socket = serverSocket.accept();
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String len;
        while ((len = reader.readLine())!=null){
            System.out.println("接收到信息：" + new String(len));
            writer.write("已经收到信息"+len);
            writer.newLine();
            writer.flush();
        }
        reader.close();
        writer.close();
        socket.close();
    }
}
