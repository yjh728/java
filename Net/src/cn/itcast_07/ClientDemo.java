package cn.itcast_07;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("yjh", 10000);
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream("receive.txt")));
        BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream()));
        String s = null;
        while ((s = bufferedReader.readLine()) != null) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedReader.close();
        socket.close();
    }
}
