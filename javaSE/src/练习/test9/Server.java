package 练习.test9;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动 , 等待连接 .... ");
        ServerSocket serverSocket=new ServerSocket(8888);
        while (true){
            new Thread(()->{
                try {
                    Socket socket=serverSocket.accept();
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
