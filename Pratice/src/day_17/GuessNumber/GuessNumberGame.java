package day_17.GuessNumber;

import java.util.Scanner;

/**
 * 这是猜数字小游戏
 *
 * @author yjh
 * @version V1.0
 */
public class GuessNumberGame {
    private GuessNumberGame() {
    }

    public static void start() {
        int number = (int) (Math.random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            count++;
            System.out.println("请输入你猜的数：");
            int guessNumber = sc.nextInt();
            if (guessNumber > number) {
                System.out.println("你猜的数"+guessNumber+"大了!你还有"+(5-count)+"次机会");
            } else if (guessNumber < number) {
                System.out.println("你猜的数"+guessNumber+"小了!你还有"+(5-count)+"次机会");
            } else {
                System.out.println("恭喜你，猜的数"+guessNumber+"对了!");
                break;
            }
        }
    }
}
