package cn.itcast_10;

import java.util.concurrent.Callable;

//Callable是带泛型的接口
//该接口的类型是call()方法的返回值类型
public class MyCallable implements Callable<Integer> {

    private int number;

    public MyCallable(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        return sum;
    }
}
