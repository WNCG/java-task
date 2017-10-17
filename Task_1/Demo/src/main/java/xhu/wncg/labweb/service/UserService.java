package xhu.wncg.labweb.service;

/**
 * @author BZhao
 * @version 2017/10/17.
 */
public interface UserService {
    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return boolean
     */
    boolean userLogin(String username, String password);
}
