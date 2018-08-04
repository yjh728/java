package cn.itcast_05;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class CilentDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("yjh", 10000);
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(outputStream));
        Scanner sc = new Scanner(System.in);
        String s = null;
        while ((s = sc.nextLine()) != null && !s.equals("exit")) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        socket.close();
    }
}
