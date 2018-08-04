package cn.itcast_01;

/*
 * getName()：获取线程名
 * setName()：设置线程名
 */
public class MyThreadDemo {
    public static void main(String[] args) {
        //创建线程对象
        /*MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();

        myThread.setName("123");
        myThread1.setName("456");
        //该方法用于启动一个线程
        //该方法会调用run()
        //run()里面是用于
        myThread.start();
        myThread1.start();*/
        //public static Thread currentThread()
        //该方法返回正在执行的线程对象
        //针对不是Thread类的子类中就这样获取线程对象名称
        //获取main()的线程名称
        System.out.println(Thread.currentThread().getName());
    }
}
