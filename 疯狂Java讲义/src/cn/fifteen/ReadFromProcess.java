package cn.fifteen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromProcess {
    public static void main(String[] args) throws IOException {
        Process process = Runtime.getRuntime().exec("javac");
        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(process.getErrorStream()))) {
            String s = null;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        }
    }
}
