package cn.itcast_09;

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
                if (x % 2 == 0) {
                    student.set("yjh", 19);
                } else {
                    student.set("zs", 20);
                }
                x++;
            }
        }
    }
}
