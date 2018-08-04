package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

//Socket在UDP协议下发送数据
public class SendDemo {
    public static void main(String[] args) throws IOException {
        //创建DatagramSocket对象
        DatagramSocket datagramSocket = new DatagramSocket();
        // 创建数据包对象
        // DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        // 构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号。
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (!s.equals("exit") && s != null) {
            byte[] bytes = s.getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length,
                    InetAddress.getByName("yjh"), 10000);
            // void send(DatagramPacket p)
            // 从此套接字发送数据报包。
            //发送数据包
            datagramSocket.send(datagramPacket);
            s = sc.nextLine();
        }
        //释放资源
        datagramSocket.close();
    }
}
