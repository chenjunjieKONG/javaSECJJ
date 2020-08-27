package homework.day20.test7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        System.out.println("服务端启动 , 等待连接 .... ");
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(() -> {
                try {
                    BufferedInputStream inputStream = new BufferedInputStream(socket.getInputStream());
                    FileOutputStream fileOutputStream = new FileOutputStream("c:/java/file/" + System.currentTimeMillis() + ".txt");
                    BufferedOutputStream outputStream = new BufferedOutputStream(fileOutputStream);
                    OutputStream iStream = socket.getOutputStream();
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = inputStream.read(bytes)) != -1) {
                        outputStream.write(bytes, 0, len);
                        iStream.write("文件上传成功".getBytes());
                    }
                    iStream.close();

                    outputStream.close();
                    inputStream.close();
                    socket.close();
                    System.out.println("文件上传已保存");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }
}
