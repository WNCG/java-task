package xhu.wncg.labweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xhu.wncg.labweb.controller.vo.Page;
import xhu.wncg.labweb.service.UserService;

import java.util.HashMap;
import java.util.Map;

/**
 * @author BZhao
 * @version 2017/10/17.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return page
     */
    @PostMapping("/login")
    public Page userLogin(String username, String password){
        Page page = new Page();
        if (username != null && password != null){
            boolean result = userService.userLogin(username, password);
            if (result) {
                page.setMessage("恭喜你，登录成功！");
                page.setCode(200);
            } else {
                page.setCode(0);
                page.setMessage("用户名或密码不正确，请重试！");
            }
        } else {
            page.setCode(0);
            page.setMessage("用户名或密码不能为空！");
        }
        System.out.println(page.getMessage());
        return page;
    }
}
