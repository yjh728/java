package cn.itcast_06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10000);
        Socket socket = serverSocket.accept();
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        /*BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(
                        new File("receive.txt"))));*/
        PrintWriter printWriter = new PrintWriter("receive.txt");
        String s = null;
        while ((s = bufferedReader.readLine()) != null) {
            /*bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.flush();*/
            printWriter.println(s);
            printWriter.flush();
        }
        printWriter.close();
        socket.close();
//        bufferedWriter.close();
    }
}
