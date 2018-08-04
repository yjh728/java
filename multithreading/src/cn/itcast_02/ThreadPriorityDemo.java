package cn.itcast_02;
/*
 * 线程只有得到CPU的时间片，也就是使用权，才能执行指令
 * 线程有两种调度模型：
 *      分时调度模型：所有线程轮流使用CPU的使用权，平均分配每个线程占用CPU的时间片
 *      抢占式调度模型：优先让优先级高的线程使用CPU，若优先级相同，就随机选择一个
 *                      优先级高的线程获取的CPU时间片相对多一些
 * java采用抢占式调度模型
 * 设置和获取优先级的方法：
 *      public final int getPriority()：返回对象的优先级
 *      public final void setPriority(int newPriority)：设置对象的优先级
 *      若优先级不在MIN_PRORITY(1)和MAX_PRIOORITY(10)的范围内
 *      则抛出IllegalArgumentException异常
 *
 * 线程默认优先级是5
 */
public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority threadPriority = new ThreadPriority();
        ThreadPriority threadPriority1 = new ThreadPriority();
        ThreadPriority threadPriority2 = new ThreadPriority();
        threadPriority.setName("qwe");
        threadPriority1.setName("asd");
        threadPriority2.setName("zxc");
        threadPriority.setPriority(10);
        threadPriority1.setPriority(1);
        System.out.println(threadPriority.getPriority());
        System.out.println(threadPriority1.getPriority());
        System.out.println(threadPriority2.getPriority());
        threadPriority.start();
        threadPriority1.start();
        threadPriority2.start();
    }
}
