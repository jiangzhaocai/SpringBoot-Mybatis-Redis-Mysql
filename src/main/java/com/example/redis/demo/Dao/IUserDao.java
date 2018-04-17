package com.example.redis.demo.Dao;

import com.example.redis.demo.Domain.User;
import jdk.nashorn.internal.objects.annotations.Property;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public  interface IUserDao {

    @Select("select username from tbl_developer where id = #{id}")
    String selectNameById(@Param("id") long id);

}
