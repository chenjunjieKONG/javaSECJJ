package homework.day20.test6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动 , 等待连接 .... ");
        //创建键盘输入
        Scanner scanner = new Scanner(System.in);
        //创建服务器端
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        //创建输出字符流写入数据
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //创建输入字符流读取数据
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //死循环
        while (true){
            //读取从客户端传来的信息
            String len=reader.readLine();
            //打印从客户端发送的信息
            System.out.println("接收到的信息：" + new String(len));
            if(len.equals("exit")){//接收到客户端发送过来的停止信息
                System.out.println("收到"+len+"停止连接");
                break;
            }
            System.out.println("请你输入你要回发的信息：");
            String str=scanner.nextLine();
            //服务器结束连接条件
            if(str.equals("exit")){
                //返回结束条件信息给客户端
                writer.write("exit");
                writer.flush();//刷新缓存
                System.out.println("结束连接");
                break;
            }
            //写入信息到客户端
            writer.write(str);
            writer.newLine();//换行
            writer.flush();//刷新缓存
        }
        //关闭资源
        reader.close();
        writer.close();
        socket.close();
    }
}
