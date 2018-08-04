package cn.itcast_02;

/*
 * public final void setDaemon(boolean on)将该线程标记为守护线程或用户线程。
 * 当正在运行的线程都是守护线程时，Java虚拟机退出。
 * 该方法必须在启动线程前调用。
 */
public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon threadDaemon = new ThreadDaemon();
        ThreadDaemon threadDaemon1 = new ThreadDaemon();

        threadDaemon.setName("qwe");
        threadDaemon1.setName("asd");

        threadDaemon.setDaemon(true);
        threadDaemon1.setDaemon(true);

        threadDaemon.start();
        threadDaemon1.start();

        Thread.currentThread().setName("zxc");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
