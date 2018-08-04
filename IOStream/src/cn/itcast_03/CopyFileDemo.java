package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        try {
            fileOutputStream = new FileOutputStream("text1.txt", true);
            fileInputStream = new FileInputStream("text.txt");
            int x = 0;
            /*while ((x = fileInputStream.read()) != -1) {
                fileOutputStream.write(x);
            }*/
            byte[] bytes = new byte[10];
            int count = 0;
            while ((x = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes);
                count++;
            }
            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
