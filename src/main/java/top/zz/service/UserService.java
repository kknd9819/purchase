package top.zz.service;

import top.zz.model.User;

import java.util.List;

/**
 * Created by X-man on 2017/3/31.
 */
public interface UserService {

    User findByUsername(String username);

    int update(User user);

    List<String> findUserPermissions(Long userId);

    List<String> findUserRoles(Long userId);
}
