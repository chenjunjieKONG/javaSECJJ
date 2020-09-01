package 练习.ting;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws IOException {
        //开启线程池
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ServerSocket serverSocket = new ServerSocket(8888);
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (true) {
                    InputStream is = null;
                    try {
                        Socket socket = serverSocket.accept();
                        is = socket.getInputStream();
                        int len;
                        byte[] b = new byte[1024];
                        len = is.read(b);
                        String msg = new String(b, 0, len);
                        //假如每次服务器端处理客户请求需要耗时5秒
                        System.out.println(Thread.currentThread().getName() + "服务器端收到消息：" + msg);
                        Thread.sleep(5000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        executorService.submit(thread);
        executorService.submit(thread);

    }

}

