package cn.itcast_02;

public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        ThreadSleep threadSleep1 = new ThreadSleep();
        ThreadSleep threadSleep2 = new ThreadSleep();
        threadSleep.setName("qwe");
        threadSleep1.setName("asd");
        threadSleep2.setName("zxc");
        threadSleep.start();
        threadSleep1.start();
        threadSleep2.start();
    }
}
