package day_17.login_regist.cn.itcast.dao;

import day_17.login_regist.cn.itcast.pojo.User;

/**
 * 这是针对用户进行操作的接口
 *
 * @author yjh
 * @version V1.1
 */
public interface UserDao {
    /**
     *
     * @param username
     * @param password
     * @return 返回是否登录成功
     */
    public abstract boolean islogin(String username, String password);

    /**
     *
     * @param user
     * @return 返回是否注册成功
     */
    public abstract boolean regist (User user);
}
