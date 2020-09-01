package 练习.og;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientTwo {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("localhost", 8888);
        while (true) {
            //客户端发送消息，发end时结束通信
            OutputStream os = socket.getOutputStream();
            Scanner scanner = new Scanner(System.in);
            String consoleStr = scanner.next();
            os.write(consoleStr.getBytes());
            if ("end".equals(consoleStr)) {
                os.close();
                socket.close();
                return;
            }

            //客户端收消息
            InputStream is = socket.getInputStream();
            int len;
            byte[] b = new byte[1024];
            len = is.read(b);
            String msg = new String(b, 0, len);
            if ("end".equals(msg)) {
                System.out.println("客户端收到服务端消息end，结束通信");
                is.close();
                socket.close();
                return;
            }
            System.out.println("客户端收到消息：" + msg);
        }
    }
}
