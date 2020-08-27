package homework.day20.test6;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端 发送数据");
        Scanner scanner=new Scanner(System.in);
        Socket socket=new Socket("localhost",8888);
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        while (true){
            System.out.println("请你输入你要发送的信息：");
            String s=scanner.nextLine();
            if(s.equals("exit")){
                break;
            }
            writer.write(s);
            writer.newLine();
            writer.flush();
            String len=reader.readLine();
            System.out.println(new String(len));
        }
        writer.close();
        socket.close();
        reader.close();
    }
}
