package cn.itcast_06;

public class DieLock extends Thread{
    private boolean flag = false;

    public DieLock(){
    }

    public DieLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized (MyLock.object) {
                System.out.println("if object");
                synchronized (MyLock.object1) {
                    System.out.println("if object1");
                }
            }
        } else {
            synchronized (MyLock.object1) {
                System.out.println("else object1");
                synchronized (MyLock.object) {
                    System.out.println("else object");
                }
            }
        }
    }
}
