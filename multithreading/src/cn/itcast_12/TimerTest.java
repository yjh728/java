package cn.itcast_12;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.SimpleFormatter;

class DeleteFolder extends TimerTask {

    private Timer timer;

    public  DeleteFolder(){}

    public DeleteFolder(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        File fileFolder = new File("F:\\yjh\\java\\multithreading\\cn");
        deleteFolder(fileFolder);
    }

    public void deleteFolder(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    deleteFolder(file1);
                } else {
                    System.out.println("delete" + file1.delete());
                }
            }
            file.delete();
            timer.cancel();
        }
    }
}

public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask timerTask = new DeleteFolder(timer);
        String s = "2018-8-3 15:04:00";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = simpleDateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        timer.schedule(timerTask, date);
    }
}
