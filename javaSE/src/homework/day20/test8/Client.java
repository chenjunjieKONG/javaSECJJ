package homework.day20.test8;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("localhost",8888);
            Scanner scanner=new Scanner(System.in);
            OutputStream stream=socket.getOutputStream();
            BufferedInputStream inputStream = new BufferedInputStream(socket.getInputStream());
            while (true){
                System.out.println("请你输入：格式：账号=密码");
                String s=scanner.nextLine();
                if(s.equals("exit")){
                    break;
                }
                if(s.split("=").length==2||s.indexOf("=")!=-1){
                    stream.write(s.getBytes());
                    stream.flush();
                }else {
                    System.out.println("你输入的格式不对");
                    continue;
                }
                int len;
                byte[] bytes = new byte[1024];
                while ((len=inputStream.read(bytes))!=-1){
                    System.out.println(new String(bytes,0,len));
                }
            }
            stream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
