package com.soft.jianyue.api.service;

import com.soft.jianyue.api.entity.User;
import com.soft.jianyue.api.entity.dto.UserDTO;

public interface UserService {

    /**
     * 根据手机号获取用户信息
     *
     * @param mobile
     * @return
     */
    User getUserByMobile(String mobile);

    /**
     * 登录方法
     *
     * @param userDTO
     * @return boolean
     */
    int signIn(UserDTO userDTO);

    /*删除*/
    void delete(long id);

    /*插入*/
    void insert(User user);

    /*通过ID 查询用户信息*/
    User getUserById(Integer id);

    /*修改用户图像*/
    void updateUser(User user);

/*通过id修改昵称*/
    int updateNickName(User user);

    /*通过id改密码*/
    int updatePassword(User user);

    /*insert UserDTO*/
    int insertDto(User user);

    /*注册方法*/
    int signUp(UserDTO userDTO);
}