package com.example.redis.demo.Dao;

import jdk.nashorn.internal.objects.annotations.Property;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public  interface UserDao {
    @Select("select loginname from tb_user where is = 1")
    String getUserName();
}
