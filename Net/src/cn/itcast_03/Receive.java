package cn.itcast_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive implements Runnable{

    private DatagramSocket datagramSocket;

    public Receive(DatagramSocket receive) {
        this.datagramSocket = receive;
    }

    @Override
    public void run() {
        try {
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
