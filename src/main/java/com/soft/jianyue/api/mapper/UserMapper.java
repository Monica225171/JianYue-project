package com.soft.jianyue.api.mapper;

import com.soft.jianyue.api.entity.User;
import com.soft.jianyue.api.entity.dto.UserDTO;
import org.apache.ibatis.annotations.*;

public interface UserMapper {
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "mobile", column = "mobile"),
            @Result(property = "password", column = "password"),
            @Result(property = "nickname", column = "nickname"),
            @Result(property = "avatar", column = "avatar"),
            @Result(property = "status", column = "status"),
            @Result(property = "regtime", column = "regtime"),
            @Result(property = "token", column = "token")
    })
    @Select("SELECT * FROM t_user WHERE mobile = #{mobile} ")
    User getUserByMobile(String mobile);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "mobile", column = "mobile"),
            @Result(property = "password", column = "password"),
            @Result(property = "nickname", column = "nickname"),
            @Result(property = "avatar", column = "avatar"),
            @Result(property = "status", column = "status"),
            @Result(property = "regtime", column = "regtime"),
            @Result(property = "token", column = "token")
    })
    @Select("SELECT * FROM t_user WHERE id = #{id} ")
    User getUserById(Integer id);

    @Update("UPDATE t_user SET password=#{password},nickname=#{nickname},avatar=#{avatar},status=#{status},token=#{token} WHERE id =#{id}")
    void update(User user);

    @Update("UPDATE t_user SET avatar=#{avatar} WHERE id =#{id}")
    void updateUser(User user);

    @Update("UPDATE t_user SET nickname=#{nickname} WHERE id =#{id}")
    int updateNickName(User user);

    @Update("UPDATE t_user SET password=#{password} WHERE id =#{id}")
    int updatePassword(User user);

    //删除
    @Delete("DELETE FROM  t_user WHERE id =#{id}")
    void delete(long id);

    @Insert("INSERT INTO t_user(mobile,password,nickname,avatar,status)" +
            " VALUES(#{mobile}, #{password}, #{nickname},#{avatar},#{status}) ")
    void insert(User user);

    @Insert("INSERT INTO t_user(mobile,password,nickname,avatar,status,regtime)" +
            " VALUES(#{mobile}, #{password}, #{nickname},#{avatar},#{status},#{regtime}) ")
    int insertDto(User user);

}