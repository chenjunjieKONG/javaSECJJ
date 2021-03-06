package homework.day20.test9;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动 , 等待连接 .... ");
        //创建服务端
        ServerSocket serverSocket=new ServerSocket(8888);
        //创建死循环，用于多个客户连接
        while (true){
            //等待客户端连接
            Socket socket=serverSocket.accept();
            //创建线程
            new Thread(()->{
                try {
                    //创建缓冲字符输入流，用于读取文件图片
                    BufferedInputStream inputStream=new BufferedInputStream(new FileInputStream("c:/c.png"));
                    //创建输出流，用于回写文件
                    BufferedOutputStream outputStream = new BufferedOutputStream(socket.getOutputStream());
                    //读取文件
                    byte[]bytes=new byte[1024];
                    int len;
                    while ((len=inputStream.read(bytes))!=-1){
                        outputStream.write(bytes,0,len);//回写文件
                        outputStream.flush();//刷新缓存
                    }
                    //关闭资源
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
