package xhu.wncg.labweb.service.impl;

import org.springframework.stereotype.Service;
import xhu.wncg.labweb.pojo.User;
import xhu.wncg.labweb.service.UserService;

/**
 * @author BZhao
 * @version 2017/10/17.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public boolean userLogin(String username, String password) {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123456");
        return username.equals(user.getUsername()) && password.equals(user.getPassword());
    }
}
