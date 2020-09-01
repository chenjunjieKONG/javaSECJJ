package homework.day20.test6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端 发送数据");
        //创建键盘输入
        Scanner scanner=new Scanner(System.in);
        //创建客户端
        Socket socket=new Socket("localhost",8888);
        //创建字符输入流读取数据
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //创建字符输出流写入数据
        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        //死循环
        while (true){
            System.out.println("请你输入你要发送的信息：");
            String s=scanner.nextLine();
            if(s.equals("exit")){//创建连接结束条件
                writer.write("exit");//结束之后发送一条信息给服务器
                writer.flush();//刷新缓存
                System.out.println("结束连接");
                break;
            }
            //写入数据
            writer.write(s);
            //换行
            writer.newLine();
            //刷新缓存
            writer.flush();
            //读取数据
            String len=reader.readLine();
            //打印从服务器返回的信息
            System.out.println("回收到的信息："+new String(len));
            if(len.equals("exit")){//回收到服务器发送的停止条件
                System.out.println("收到"+len+"停止连接");
                break;
            }
        }
        //关闭资源
        writer.close();
        socket.close();
        reader.close();
    }
}
