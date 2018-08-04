package cn.itcast_06;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("yjh", 10000);
        BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream()));
//        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        Scanner sc = new Scanner(System.in);
        String s = null;
        while ((s = sc.nextLine()) != null && !s.equals("exit")) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.flush();
//            printWriter.println(s);
        }
        socket.close();
    }
}
