package cn.itcast_03;

import java.io.IOException;
import java.net.DatagramSocket;

public class ChatRoom {
    public static void main(String[] args) throws IOException {
        DatagramSocket sendDatagramSocket = new DatagramSocket();
        DatagramSocket receiveDatagramSocket = new DatagramSocket(10000);

        Send send = new Send(sendDatagramSocket);
        Receive receive = new Receive(receiveDatagramSocket);

        Thread sendThread = new Thread(send);
        Thread receiveThread = new Thread(receive);

        sendThread.start();
        receiveThread.start();
    }
}
