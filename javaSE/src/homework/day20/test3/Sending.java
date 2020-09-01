package homework.day20.test3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Sending {
    public static void main(String[] args) throws Exception {
        //创建发送端Socket对象
        DatagramSocket ds = new DatagramSocket();
        //创建数据并打包  DatagramPacket表示数据包
        //数据 byte[] 设备地址ip 进程的地址 ：端口号
        String s = "Hello UDP";
        byte[] bys = s.getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("localhost");
        int port = 8888;
        DatagramPacket dp = new DatagramPacket(bys, length, address,port);
        //发送数据
        ds.send(dp);
        //释放资源
        ds.close();
    }
}
