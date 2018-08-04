package cn.itcast_06;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) {
        File fileFolder = new File("F:\\Android");
        findFile(fileFolder);
    }

    public static void findFile(File fileFolder) {
        File[] files = fileFolder.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                findFile(file);
            } else {
                BufferedInputStream bufferedInputStream = null;
                BufferedOutputStream bufferedOutputStream = null;
                try {
                    bufferedInputStream = new BufferedInputStream(
                            new FileInputStream(file.getAbsoluteFile()));
                    String s = "F:\\text\\" + file.getName();
                    bufferedOutputStream = new BufferedOutputStream(
                            new FileOutputStream(s));
                    byte[] bytes = new byte[1024];
                    int len = 0;
                    while ((len = bufferedInputStream.read(bytes)) != -1) {
                        bufferedOutputStream.write(bytes);
                        bufferedOutputStream.flush();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        bufferedInputStream.close();
                        bufferedOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
