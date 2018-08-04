package cn.fifteen;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;
import java.util.Scanner;

public class WriteToProcess {
    public static void main(String[] args) throws IOException {
        Process process = Runtime.getRuntime().exec("java ReadStandard");
        try (PrintStream printStream = new PrintStream(process.getOutputStream())) {
            printStream.println("普通字符串");
            printStream.println(new WriteToProcess());
        }
    }
}

class ReadStandard{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             PrintStream printStream = new PrintStream(
                     new FileOutputStream("ut.txt"))) {
            scanner.useDelimiter("\n");
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}