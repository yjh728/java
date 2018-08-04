package cn.itcast_04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 *  TCP协议发送数据：
 *  A:创建客户端Scocket对象
 *  B:获取输出流，发送数据
 *  C:释放资源
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("yjh", 10000);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello, TCP协议".getBytes());
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println("serverSocket:" + new String(bytes, 0, len));
        socket.close();
    }
}
