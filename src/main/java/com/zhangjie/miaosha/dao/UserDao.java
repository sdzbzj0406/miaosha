package com.zhangjie.miaosha.dao;

import com.zhangjie.miaosha.dataobject.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author jason
 */
@Mapper
@Repository
public interface UserDao{

    /**
     * 根据id查询用户
     * @param id id
     * @return 用户
     */
    @Select("select * from user where id = #{id}")
    User getById(@Param("id")int id	);

    /**
     * 插入新用户
     * @param user 用户
     * @return 插入结果
     */
    @Insert("insert into user(id, name)values(#{id}, #{name})")
    int insert(User user);

}
