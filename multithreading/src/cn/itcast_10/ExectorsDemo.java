package cn.itcast_10;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExectorsDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        /*Future future = executorService.submit(new MyRunnable());
        Future future1 = executorService.submit(new MyRunnable());
        executorService.shutdown();*/
        Future<Integer> future = executorService.submit(new MyCallable(50));
        Future<Integer> future1 = executorService.submit(new MyCallable(100));
        Integer integer = future.get();
        Integer integer1 = future1.get();
        System.out.println(integer);
        System.out.println(integer1);
        executorService.shutdown();
    }
}
