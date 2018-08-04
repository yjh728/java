package cn.itcast_03;

import java.io.*;

public class CopyMp4Dem0 {
    public static void main(String[] args) throws IOException {
        //高效字节流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(
                new FileInputStream("F:\\1.mp4"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(
                new FileOutputStream("D:\\1.mp4"));
        byte[] bytes = new byte[1024];
        int count = 0;
        while ((count = bufferedInputStream.read(bytes)) != -1) {
            bufferedOutputStream.write(bytes, 0, count);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
