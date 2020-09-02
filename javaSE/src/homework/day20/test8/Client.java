package homework.day20.test8;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            //创建客户端
            Socket socket=new Socket("localhost",8888);
            //键盘输入
            Scanner scanner=new Scanner(System.in);
            //创建输出流
            OutputStream os=socket.getOutputStream();
            //创建字节输出流
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            while (true){
                System.out.println("请你输入：格式：账号=密码");
                String s=scanner.nextLine();
                //结束条件
                if(s.equals("exit")){
                    os.write(s.getBytes());
                    os.flush();
                    break;
                }
                //判断格式
                if(s.split("=").length==2||s.indexOf("=")!=-1){
                    os.write(s.getBytes());
                    os.flush();
                }else {
                    System.out.println("你输入的格式不对");
                    continue;
                }
                //读取回写
                int len;
                byte[] bytes = new byte[1024];
                while ((len=bis.read(bytes))!=-1){
                    System.out.println(new String(bytes,0,len));
                }
            }
            //关闭资源
            bis.close();
            os.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
