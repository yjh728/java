package cn.itcast_02;

/*
 * public final void join()：线程加入，这个线程执行完才执行其他线程
 */
public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin threadJoin = new ThreadJoin();
        ThreadJoin threadJoin1 = new ThreadJoin();
        ThreadJoin threadJoin2 = new ThreadJoin();

        threadJoin.setName("qwe");
        threadJoin1.setName("asd");
        threadJoin2.setName("zxc");

        threadJoin.start();
        try {
            threadJoin.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadJoin1.start();
        threadJoin2.start();
    }
}
