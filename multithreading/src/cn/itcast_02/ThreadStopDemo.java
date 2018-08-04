package cn.itcast_02;

/*
 * public final void stop():让线程停止
 * public void interrupt()：中断线程。中断线程，并抛出InterruptedException异常
 */
public class ThreadStopDemo {
    public static void main(String[] args) {
        ThreadStop threadStop = new ThreadStop();
        threadStop.start();

        try {
            Thread.sleep(3000);
//            threadStop.stop();
            threadStop.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
