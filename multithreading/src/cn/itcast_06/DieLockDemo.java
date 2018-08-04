package cn.itcast_06;

public class DieLockDemo {
    public static void main(String[] args) {
        DieLock dieLock = new DieLock(true);
        DieLock dieLock1 = new DieLock(false);

        dieLock.setName("lock1");
        dieLock.setName("lock2");

        dieLock.start();
        dieLock1.start();
    }
}
