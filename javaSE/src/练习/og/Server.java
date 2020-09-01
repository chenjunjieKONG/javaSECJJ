package 练习.og;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        //思考：此行代码是放在while循环外面还是里面？
        Socket socket = serverSocket.accept();
        while (true) {
            //服务器端收消息
            InputStream is = socket.getInputStream();
            int len;
            byte[] b = new byte[1024];
            len = is.read(b);
            String msg = new String(b, 0, len);
            if ("end".equals(msg)) {
                System.out.println("服务器端收到客户端消息end，结束通信");
                is.close();
                socket.close();
                return;
            }
            System.out.println("服务器端收到消息：" + msg);

            // 服务器端发消息
            Scanner scanner = new Scanner(System.in);
            String consoleStr = scanner.next();
            OutputStream os = socket.getOutputStream();
            os.write(consoleStr.getBytes());
            if ("end".equals(consoleStr)) {
                is.close();
                os.close();
                socket.close();
                return;
            }
        }
    }

}

