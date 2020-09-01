package homework.day20.test7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Server {
    public static void main(String[] args) throws IOException {

        System.out.println("服务端启动 , 等待连接 .... ");
        //创建服务器端
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            //等待连接
            Socket socket = serverSocket.accept();
            //创建线程
            new Thread(() -> {
                BufferedInputStream bis = null;
                BufferedOutputStream bos = null;
                OutputStream os = null;
                try {
                    //定义日期用来当文件名
                    Date date = new Date();
                    //格式化日期
                    DateFormat format = new SimpleDateFormat("yyyyMMdd-HH-mm-ss-SSS");
                    String str=format.format(date);
                    //创建缓冲字节输入流用来读取客户端传送的文件
                    bis = new BufferedInputStream(socket.getInputStream());
                    //创建缓冲字节输出流用来写入传送来的文件到指定路径
                    bos = new BufferedOutputStream(new FileOutputStream("c:/java/file/"
                            +str+ ".txt"));
                    //创建字节输出流用于回写信息给客户端
                    os = socket.getOutputStream();
                    //读取客户端传来的文件
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = bis.read(bytes)) != -1) {
                        //把客户端传送的文件写入指定文件
                        bos.write(bytes, 0, len);
                        //回写信息给客户端
                        os.write("文件上传成功".getBytes());
                    }
                    //关闭资源
                    os.close();
                    bos.close();
                    bis.close();
                    socket.close();
                    System.out.println("文件上传已保存");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }
}
