package cn.fifteen;

import java.io.*;

public class InsertContent {
    public static void main(String[] args) throws IOException {
        insert("InsertContent.java", 45, "插入的内容\r\n");
    }

    public static void insert(String fileName, long pos, String insertContent) throws IOException {
        File file = File.createTempFile("tmp", null);
        try (
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                RandomAccessFile randomAccessFile = new RandomAccessFile(fileName, "rw");
        ) {
            randomAccessFile.seek(pos);
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = randomAccessFile.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
            randomAccessFile.seek(pos);
            randomAccessFile.write(insertContent.getBytes());
            while ((len = fileInputStream.read(bytes)) != -1) {
                randomAccessFile.write(bytes, 0, len);
            }
        }
    }
}
