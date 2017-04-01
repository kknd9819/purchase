package top.zz.service.impl;

import org.springframework.stereotype.Service;
import top.zz.dao.UserDao;
import top.zz.model.User;
import top.zz.service.UserService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
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
    public int update(User user) {
        return userDao.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<String> findUserPermissions(Long userId) {
        List<String> result = userDao.findUserPermissions(userId);
        return result;
    }

    @Override
    public List<String> findUserRoles(Long userId) {
        return userDao.findUserRoles(userId);
    }
}
