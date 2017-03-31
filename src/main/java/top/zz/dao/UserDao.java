package top.zz.dao;

import org.apache.ibatis.annotations.Param;
import top.zz.model.User;

import java.util.Map;

/**
 * Created by X-man on 2017/3/31.
 */
public interface UserDao {

    User findByUsername(@Param("username") String username);

    void update(Map<String,Object> map);
}
