package top.zz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.zz.service.UserService;

import javax.annotation.Resource;

/**
 * Created by X-man on 2017/4/1.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/user")
    @ResponseBody
    public String hello(){
        Long id = 1L;
        String s = userService.findUserPermissions(id).get(0);
        return s;
    }
}
