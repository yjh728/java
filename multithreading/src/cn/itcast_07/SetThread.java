package cn.itcast_07;

public class SetThread implements Runnable {
    private Student student;

    public SetThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        int x = 0;
        while (true) {
            synchronized (student) {
                if (student.flag) {
                    try {
                        student.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (x % 2 == 0) {
                    student.name = "yjh";
                    student.age = 19;
                } else {
                    student.name = "zs";
                    student.age = 20;
                }
                x++;
                student.flag = true;
                student.notify();
            }
        }
    }
}
