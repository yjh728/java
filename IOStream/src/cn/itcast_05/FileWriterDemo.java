package cn.itcast_05;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("fw.txt");
        fileWriter.write('杨');
        fileWriter.write("yjh728", 2, 4);
        fileWriter.write("杨佳豪728".toCharArray(), 2, 4);
        fileWriter.flush();
        fileWriter.close();
        FileReader fileReader = new FileReader("fw.txt");
        /*char[] chars = new char[1024];
        fileReader.read(chars);
        System.out.println(new String(chars));*/
        int x = 0;
        while ((x = fileReader.read()) != -1) {
            System.out.println(x);
        }
        fileReader.close();
    }
}
