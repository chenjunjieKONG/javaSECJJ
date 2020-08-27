package homework.day20.test7;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("客户端 发送数据");
            Socket socket = new Socket("localhost", 8888);
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(s));
            BufferedOutputStream outputStream = new BufferedOutputStream(socket.getOutputStream());

            byte[] bytes = new byte[1024];
            int len;
            while ((len = inputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
                outputStream.flush();
            }
            System.out.println("文件发送完毕");

            InputStream stream = socket.getInputStream();
            byte[] b = new byte[1024];
            int i=stream.read(b);
            System.out.println(new String(b,0,i));

            stream.close();
            outputStream.close();
            inputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
