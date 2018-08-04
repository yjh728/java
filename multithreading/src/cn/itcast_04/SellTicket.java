package cn.itcast_04;

/*
 * 加入延迟后出现了两个问题(线程安全问题)：
 *      A：卖相同的票
 *          CPU的一次操作必须是原子性的(最简单便捷的)操作
 *      B：卖负数票
 *          延迟和随机性导致
 */

/*
 * 如何解决线程安全问题？
 * 原因：
 *      1、是否是多线程环境
 *      2、是否有共享数据
 *      3、是否有多条语句操作共享数据
 * 因为1和2不能解决，因此只能解决3
 * 解决思想：将多条语句共享数据的代码块包成一个整体，别人不能执行
 *           Java提供了同步机制
 * 同步代码块：
 *      synchronized(对象) {  //该对象应为同一个对象，只有同一个对象才能锁住
 *                            //可以理解为只有同一把锁才能锁住，不让别人打开
 *          需要同步的代码;
 *      }
 */
public class SellTicket implements Runnable {
    private int ticket = 100;
    private Object object = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName()
                            + "正在出售第" + (ticket--) + "张票");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.exit(0);
                }
            }
        }
    }
}
