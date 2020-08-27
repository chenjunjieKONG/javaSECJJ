package homework.day20.test9;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        System.out.println("客户端 发送数据");
        try {
            Socket socket=new Socket("localhost",8888);
            BufferedInputStream inputStream=new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream("D:/ccc.png"));
            byte[]bytes=new byte[1028];
            int len;
            while ((len=inputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,len);
            }
            outputStream.close();
            inputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
