package cn.itcast_06;

import java.io.*;

public class CopyDemo2 {
    public static void main(String[] args) {
        File srcFile = new File("F:\\Android\\Test");
        File destFile = new File("F:\\");
        copyAllFiles(srcFile, destFile);
    }

    private static void copyAllFiles(File srcFile, File destFile) {
        if (srcFile.isDirectory()) {
            File newFolder = new File(destFile, srcFile.getName());
            newFolder.mkdir();
            File[] files = srcFile.listFiles();
            for (File file : files) {
                copyAllFiles(file, newFolder);
            }
        } else {
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }

    private static void copyFile(File srcFile, File newFile) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedInputStream = new BufferedInputStream(
                    new FileInputStream(srcFile));
            bufferedOutputStream = new BufferedOutputStream(
                    new FileOutputStream(newFile));
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, len);
                bufferedOutputStream.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}