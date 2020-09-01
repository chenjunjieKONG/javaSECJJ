package 练习.ti;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        while (true) {
            Socket socket = new Socket("localhost", 8888);
            Scanner scanner = new Scanner(System.in);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("请你输入：格式：账号=密码");
            String s = scanner.nextLine();
            if (s.equals("exit")) {
//                    os.write(s.getBytes());
                bw.close();
                br.close();
                socket.close();
                break;
            }
            if (s.contains("=")) {
                bw.write(s);
                bw.newLine();
                bw.flush();
//                socket.shutdownOutput();
            } else {
                System.out.println("你输入的格式不对");
                bw.close();
                br.close();
                socket.close();
                continue;

            }
            String len;
            while ((len = br.readLine()) != null) {
                System.out.println(len);
            }
            bw.close();
            br.close();
            socket.close();
        }
    }
}
