package homework.day20.test9;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动 , 等待连接 .... ");
        ServerSocket serverSocket=new ServerSocket(8888);
        while (true){
            Socket socket=serverSocket.accept();
            new Thread(()->{
                try {
                    BufferedInputStream inputStream=new BufferedInputStream(new FileInputStream("c:/c.png"));
                    BufferedOutputStream outputStream = new BufferedOutputStream(socket.getOutputStream());
                    byte[]bytes=new byte[1024];
                    int len;
                    while ((len=inputStream.read(bytes))!=-1){
                        outputStream.write(bytes,0,len);
                        outputStream.flush();
                    }
                    outputStream.close();
                    inputStream.close();
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
