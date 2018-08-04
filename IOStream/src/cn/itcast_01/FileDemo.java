package cn.itcast_01;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        /*File file = new File("F:\\yjh\\java\\IOStream\\java");
        foreach(file);*/
    }

    private static void foreach(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                foreach(file1);
            } else {
                System.out.println("delete:" + file1.getName() + file1.delete());
            }
        }
        System.out.println("delete:"+file.getName()+file.delete());
    }


}
