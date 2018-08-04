package cn.itcast_07;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        SetThread setThread = new SetThread(student);
        GetThread getThread = new GetThread(student);

        Thread thread = new Thread(setThread);
        Thread thread1 = new Thread(getThread);

        thread.start();
        thread1.start();
    }
}
