package cn.itcast_05;

import java.util.*;

public class ThreadDemo {
    public static void main(String[] args) {
        //线程安全的类
        StringBuffer stringBuffer = new StringBuffer();
        Vector<String> vector = new Vector<>();
        Hashtable<String, String> hashtable = new Hashtable<>();
        //线程不安全的集合
        List<String> list = new ArrayList<>();
        //线程安全的集合
        List<String> list1 = Collections.synchronizedList(new ArrayList<>());
    }
}
