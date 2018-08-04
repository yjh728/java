package cn.itcast_09;

public class GetThread implements Runnable {
    private Student student;

    public GetThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (student) {
                student.get();
            }
        }
    }
}
