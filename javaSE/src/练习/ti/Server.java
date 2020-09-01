package 练习.ti;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {

        //创建服务端
        ServerSocket serverSocket = new ServerSocket(8888);
        //创建死循环，用于多个客户连接

        Thread thread = new Thread(() -> {
            while (true) {
                //等待客户端连接
                try {
                    Socket socket = serverSocket.accept();
                    //创建线程
                    //获取文件
                    File file = new File("c:/test");
                    //创建缓冲字符输入流，用于读取文件中的内容
                    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                    //创建缓冲字节输入流，用于读取客户端的传输过来的数据
                    BufferedReader bis = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//                        InputStream is=socket.getInputStream();
                    //创建输出流，用于回写信息
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                    //读取文件里面的内容
                    String len;
                    while ((len = br.readLine()) != null) {
                        //分割文件里面内容
                        String[] str = (len).split("=");

                        //读取客户端传过来的信息
                        byte[] bytes = new byte[1024];
                        //
                        String s = bis.readLine();
                        if (s != null) {
                            String[] socketStr = s.split("=");
                            //分割客户端传过来的信息，分为用户名和密码
                            //                                String[] ling = new String(bytes, 0, setLen).split("=");
                            if (str[0].equals(socketStr[0])) {//判断用户名是否存在
                                bw.write("用户名存在");//存在就回写这个
                                bw.newLine();
                                bw.flush();

                                if (str[1].equals(socketStr[1])) {//再判断密码是否正确
                                    bw.write("密码正确");//正确就回写这个
                                    bw.newLine();
                                    bw.flush();
                                } else {
                                    bw.write("密码不正确");//不正确就回写这个
                                    bw.newLine();
                                    bw.flush();
                                }
                            } else {//不存在就执行把内容写入文件中完成注册的功能
                                bw.write("用户名不存在");//不存在就回写这个
                                bw.newLine();
                                bw.flush();
                                //
                                BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
                                //把客户端传来的数据当用户名和密码来写入文件中当注册
                                bw.write(len);
                                bw.newLine();//换行
                                bw.flush();//刷新缓存
                            }
                        }

                        bis.close();
                        br.close();
                        socket.close();
                        bw.close();
                        break;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });
        thread.start();


    }
}
