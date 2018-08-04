package cn.itcast_04;

import java.io.*;
import java.lang.String;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(
                new FileOutputStream("osw.txt"));
        outputStreamWriter.write("中国");
        outputStreamWriter.close();
        InputStreamReader inputStreamReader = new InputStreamReader(
                new FileInputStream("osw.txt"), "UTF-8");
        int x = 0;
        while ((x = inputStreamReader.read()) != -1) {
            System.out.println((char)x);
        }
    }
}
