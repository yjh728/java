package cn.itcast_02;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
    public static void main(String[] args) {
        //打开文件，若文件不存在，则调用系统功能进行创建，若存在，则直接覆盖写
        //第二个参数可以指定是否以追加形式打开文件
        //FileOutputStream(String name, boolean append)
        FileOutputStream fileOutputStream = null;
        try {
            //不存在的路径
            //fileOutputStream = new FileOutputStream("z:\\text.txt");
            fileOutputStream = new FileOutputStream("text.txt");
            //写入ASCII码为49的字符
            fileOutputStream.write(49);
            fileOutputStream.write('\n');
            //写入该byte数组的内容
            fileOutputStream.write("yjh728".getBytes());
            fileOutputStream.write('\n');
            //从索引为2处开始写，写入3个字节
            fileOutputStream.write("asdfghj".getBytes(), 2, 3);
            fileOutputStream.write('\n');
            for (int i = 0; i < 10; i++) {
                fileOutputStream.write(("yjh" + i + "\r\n").getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        try {
            fileOutputStream = new FileOutputStream("text.txt", true);
            fileOutputStream.write("yjh728".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
