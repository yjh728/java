package cn.itcast_12;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new MyTask(timer), 2000);
    }
}

class MyTask extends TimerTask {

    private Timer timer;

    public MyTask() {
    }

    public MyTask(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        System.out.println("boom");
        timer.cancel();
    }
}