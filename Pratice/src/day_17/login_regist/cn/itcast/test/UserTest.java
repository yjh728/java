package day_17.login_regist.cn.itcast.test;

import day_17.GuessNumber.GuessNumberGame;
import day_17.login_regist.cn.itcast.dao.UserDao;
import day_17.login_regist.cn.itcast.dao.impl.UserDaoImpl;
import day_17.login_regist.cn.itcast.pojo.User;

import java.util.Scanner;

/**
 * 这是用户测试类
 *
 * @author yjh
 * @version V1.0
 */
public class UserTest {
    public static void main(String[] args) {
        outer:
        while (true) {
            System.out.println("--------欢迎光临--------");
            System.out.println("1 登录");
            System.out.println("2 注册");
            System.out.println("3 退出");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的选择：");
            UserDao udi = new UserDaoImpl();
            String choice = sc.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("--------登录界面--------");
                    System.out.println("请输入用户名：");
                    String username = sc.nextLine();
                    System.out.println("请输入密码：");
                    String password = sc.nextLine();
                    if (udi.islogin(username, password)) {
                        System.out.println("登录成功!");
                        System.out.println("你是否要玩游戏?y/n");
                        String choice2 = sc.nextLine();
                        while (true) {
                            if (choice2.equalsIgnoreCase("y")) {
                                GuessNumberGame.start();
                                System.out.println("你还玩吗?y/n");
                                choice2 = sc.nextLine();
                            } else {
                                break outer;
                            }
                        }
                    } else {
                        System.out.println("登录失败，用户名或密码错误!");
                    }
                    break;
                case "2":
                    System.out.println("--------注册界面--------");
                    User user = new User();
                    System.out.println("请输入用户名：");
                    user.setUsername(sc.nextLine());
                    System.out.println("请输入密码：");
                    user.setPassword(sc.nextLine());
                    if (udi.regist(user)) {
                        System.out.println("恭喜注册成功!");
                    } else {
                        System.out.println("注册失败，该用户已存在!");
                    }
                    break;
                case "3":
                default:
                    System.out.println("欢迎您的下次使用!");
                    System.exit(0);
            }
        }
    }
}
