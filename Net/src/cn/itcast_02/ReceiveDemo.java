package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
//        DatagramSocket(int port)
//        创建数据报套接字并将其绑定到本地主机上的指定端口。
        //创建DatagramSocket对象
        DatagramSocket datagramSocket = new DatagramSocket(10000);
//        DatagramPacket(byte[] buf, int length)
//        构造 DatagramPacket，用来接收长度为 length 的数据包。
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
//        void receive(DatagramPacket p)
//        从此套接字接收数据报包。
        while (true) {
            datagramSocket.receive(datagramPacket);//此方法在接收到数据包前一直阻塞
//        void setData(byte[] buf)
//        为此包设置数据缓冲区。
            System.out.println(datagramPacket.getAddress().getHostAddress()
                    + new String(datagramPacket.getData(),
                    0, datagramPacket.getLength()));
        }
        //释放资源
//        datagramSocket.close();
    }
}
