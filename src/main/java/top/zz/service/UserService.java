package top.zz.service;

import top.zz.model.User;

/**
 * Created by X-man on 2017/3/31.
 */
public interface UserService {

    User findByUsername(String username);

    void update(User user);
}