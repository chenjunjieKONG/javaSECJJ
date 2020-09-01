package 练习.test8;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            //创建服务端
            ServerSocket serverSocket = new ServerSocket(8888);
            //创建死循环，用于多个客户连接
            while (true) {
                //等待客户端连接
                Socket socket = serverSocket.accept();
                //创建线程
                new Thread(() -> {
                    try {
                        //获取文件
                        File file = new File("C:/test.txt");
                        //创建缓冲字符输入流，用于读取文件中的内容
                        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                        //创建缓冲字节输入流，用于读取客户端的传输过来的数据
                        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
//                        InputStream is=socket.getInputStream();
                        //创建输出流，用于回写信息
                        OutputStream os = socket.getOutputStream();
                        //读取文件里面的内容
                        String len;
                        while ((len = br.readLine()) != null) {
                            //分割文件里面内容
                            String[] str = new String(len).split("=");
                            //读取客户端传过来的信息
                            byte[] bytes = new byte[1024];
                            int setLen;
                            while ((setLen = bis.read(bytes)) != -1) {
                                if(new String(bytes, 0, setLen).equals("exit")){//收到客户端的结束条件，就跳出循环
                                    System.out.println("收到"+new String(bytes, 0, setLen)+"结束连接");
                                    break;
                                }
                                //分割客户端传过来的信息，分为用户名和密码
                                String[] ling = new String(bytes, 0, setLen).split("=");
                                if (str[0].equals(ling[0])) {//判断用户名是否存在
                                    os.write("用户名存在\r\n".getBytes());//存在就回写这个
                                    os.flush();//刷新缓存
                                    if (str[1].equals(ling[1])) {//再判断密码是否正确
                                        os.write("密码正确".getBytes());//正确就回写这个
                                        os.flush();//刷新缓存
                                    } else {
                                        os.write("密码不正确".getBytes());//不正确就回写这个
                                        os.flush();//刷新缓存
                                    }
                                } else {//不存在就执行把内容写入文件中完成注册的功能
                                    os.write("用户名不存在\r\n".getBytes());//不存在就回写这个
//                                    os.flush();//刷新缓存
                                    System.out.println(new String(bytes, 0, setLen));
                                    //创建缓冲字符输出流，用于写入数据到文件中，完成注册
                                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
                                    //把客户端传来的数据当用户名和密码来写入文件中当注册
                                    bw.write(new String(bytes, 0, setLen));
                                    bw.newLine();//换行
                                    bw.flush();//刷新缓存
                                    bw.close();//关闭资源
                                    os.write("注册成功".getBytes());
                                    //关闭资源
                                }
                            }
                        }
                        os.close();
                        bis.close();
                        br.close();
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
