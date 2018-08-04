package cn.itcast_02;

/*
 * Thread static void yield()：暂停当前正在执行的线程对象，并执行其他线程
 */
public class ThreadYield extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "---" + i);
            Thread.yield();
        }
    }
}
