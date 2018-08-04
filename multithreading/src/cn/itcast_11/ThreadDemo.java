package cn.itcast_11;

public class ThreadDemo {
    public static void main(String[] args) {
        //继承Thead类来实现多线程
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }.start();

        //实现Runnable接口实现多继承
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();

        //运行的是Thread子类的run方法
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("runnable" + ":" + i);
                }
            }
        }){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("thread" + ":" + i);
                }
            }
        }.start();
    }
}
