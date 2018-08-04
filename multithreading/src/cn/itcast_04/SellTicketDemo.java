package cn.itcast_04;

/*
 * 同步的提点：
 *      前提：
 *          多个线程
 *      解决问题是要注意：
 *          多个线程使用的是同一个锁对象
 * 同步的好处：
 *      解决了多线程的安全问题
 * 弊端：
 *      当线程很多时，因为每个线程都会去判断同步上的锁，很耗费资源，无形中会降低程序的执行效率
 */

/*
 *  同步代码块的对象是？
 *      任意对象
 *  同步方法的格式及锁对象问题？
 *      把同步加到方法上，一般在权限修饰符之后
 *
 *      同步方法的锁对象是？
 *          this
 *  静态方法及锁对象问题？
 *      静态方法的锁对象是？
 *          类的字节码文件对象
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();
        Thread thread = new Thread(sellTicket, "窗口1");
        Thread thread1 = new Thread(sellTicket, "窗口2");
        Thread thread2 = new Thread(sellTicket, "窗口3");
        thread.start();
        thread1.start();
        thread2.start();
    }
}
