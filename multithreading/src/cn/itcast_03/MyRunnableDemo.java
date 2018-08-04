package cn.itcast_03;

import java.util.TreeMap;

/*
 * 实现线程的另一种方法：
 *      实现Runnable接口
 *      创建实现类的对象
 *      创建Tread对象，并将实现类的对象作为参数传递
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "qwe");
        Thread thread1 = new Thread(myRunnable, "asd");
        thread.start();
        thread1.start();
    }
}
