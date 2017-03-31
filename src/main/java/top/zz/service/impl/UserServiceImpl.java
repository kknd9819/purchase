package top.zz.service.impl;

import org.springframework.stereotype.Service;
import top.zz.dao.UserDao;
import top.zz.model.User;
import top.zz.service.UserService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by X-man on 2017/3/31.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }

    @Override
    public void update(User user) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("user",user);
        userDao.update(map);
    }
}
