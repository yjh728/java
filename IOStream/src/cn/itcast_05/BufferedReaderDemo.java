package cn.itcast_05;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader("fw.txt"));
//        char[] buf = new char[1024];
        String s = bufferedReader.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("copy.txt"));
        bufferedWriter.write(s);
        bufferedWriter.newLine();
        bufferedWriter.close();
        bufferedReader.close();
    }
}
