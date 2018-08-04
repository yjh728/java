package cn.itcast_08;

/*
 *  线程组：把多个线程组合到一起
 *  它可以对一批线程进行匪类管理，Java程序允许直接对线程组进行操作
 */
public class ThreadGroupDemo {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        ThreadGroup threadGroup2 = new ThreadGroup("new_group");
        Thread thread = new Thread(threadGroup2, myRunnable, "yjh");
        Thread thread1 = new Thread(threadGroup2, myRunnable, "zs");
        ThreadGroup threadGroup = thread.getThreadGroup();
        ThreadGroup threadGroup1 = thread1.getThreadGroup();
        System.out.println(threadGroup.getName());
        System.out.println(threadGroup1.getName());
        System.out.println(Thread.currentThread().getThreadGroup().getName());
    }
}
