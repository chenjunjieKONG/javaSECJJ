package 练习.tests;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8888);
            while (true) {
                Socket socket = serverSocket.accept();
                new Thread(() -> {
                    try {
                        File file = new File("C:/test.txt");
                        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                        BufferedInputStream inputStream = new BufferedInputStream(socket.getInputStream());
                        OutputStream outputStream = socket.getOutputStream();
                        String len;
                        while ((len = reader.readLine()) != null) {
                            String[] str = new String(len).split("=");
                            byte[] bytes = new byte[1024];
                            int setLen;
                            while ((setLen = inputStream.read(bytes)) != -1) {
                                String[] ling = new String(bytes, 0, setLen).split("=");
                                if (str[0].equals(ling[0])) {
                                    outputStream.write("账号存在\r\n".getBytes());
                                    outputStream.flush();
                                    if (str[1].equals(ling[1])) {
                                        outputStream.write("密码正确\r\n".getBytes());
                                        outputStream.flush();
                                    } else {
                                        outputStream.write("密码不正确\r\n".getBytes());
                                        outputStream.flush();
                                    }
                                } else {
                                    outputStream.write("账号不存在\r\n".getBytes());
                                    outputStream.flush();
                                    System.out.println(new String(bytes, 0, setLen));
                                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
                                    writer.write(new String(bytes, 0, setLen));
                                    writer.newLine();
                                    writer.flush();
                                    writer.close();
                                    String string;
                                    while ((string = reader.readLine()) != null) {
                                        if (string.equals(new String(bytes, 0, setLen))) {
                                            outputStream.write("注册成功\r\n".getBytes());
                                            break;
                                        }
                                    }

                                }
                            }
                        }
                        outputStream.close();
                        inputStream.close();
                        reader.close();
                        socket.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}