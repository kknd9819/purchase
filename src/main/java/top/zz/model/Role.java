package top.zz.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by X-man on 2017/3/31.
 */
public class Role implements Serializable {

    private static final long serialVersionUID = -253625885561218068L;

    private Long id; // 编号
    private String role; // 角色标识程序中判断使用,如"admin",这个是唯一的:
    private String description; // 角色描述,UI界面显示使用

    //角色 -- 权限关系：多对多关系;
    private List<Permission> permissions;

    // 用户 - 角色关系定义;
    private List<User> users;// 一个角色对应多个用户

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
