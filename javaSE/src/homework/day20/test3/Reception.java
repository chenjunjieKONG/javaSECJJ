package homework.day20.test3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Reception {
    public static void main(String[] args) throws Exception {
        //创建接收端Socket对象,此处的端口号要跟发送端一致
        DatagramSocket ds = new DatagramSocket(8888);
        //接收数据
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        System.out.println("接受前");
        ds.receive(dp);
        System.out.println("接收后");
        //解析数据
        byte[] data = dp.getData();
        int length = dp.getLength();
        //输出数据
        System.out.println(new String(data,0,length));
    }
}
