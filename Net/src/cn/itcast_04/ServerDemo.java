package cn.itcast_04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 *  TCP协议接受数据：
 *  A:创建接收端的Socket对象
 *  B:监听客户端连接，返回一个对应的Socket对象
 *  C:获取输入流，读取数据到控制台
 *  D:关闭对应客户端
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while (true) {
            len = inputStream.read(bytes);
            if (len > 0) {
                System.out.println(socket.getInetAddress().getHostAddress() + ":" +
                        new String(bytes, 0, len));
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("hello，TCP客户端".getBytes());
            }
        }
//        socket.close();
    }
}
