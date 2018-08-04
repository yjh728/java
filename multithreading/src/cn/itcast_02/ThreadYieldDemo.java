package cn.itcast_02;

public class ThreadYieldDemo {
    public static void main(String[] args) {
        ThreadYield threadYield = new ThreadYield();
        ThreadYield threadYield1 = new ThreadYield();
//        ThreadYield threadYield2 = new ThreadYield();

        threadYield.setName("qwe");
        threadYield1.setName("asd");
//        threadYield2.setName("zxc");
        threadYield.start();
        threadYield1.start();
    }
}
