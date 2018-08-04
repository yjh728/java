package cn.itcast_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Send implements Runnable{

    private DatagramSocket datagramSocket;

    public Send(DatagramSocket send) {
        this.datagramSocket = send;
    }

    @Override
    public void run() {
        try {
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
