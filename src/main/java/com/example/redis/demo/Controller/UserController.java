package com.example.redis.demo.Controller;

import com.example.redis.demo.Domain.User;
import com.example.redis.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
//import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  //  @Autowired
  //  private RedisTemplate redis;
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/hello")
 //   @Cacheable(value = "getOneVideo")
    public User getUser() {
        User user = new User(1, "xc", "123456");
        System.out.println("未用缓存");
        long id = 3l;
        String name = userService.getUserNameById(id);
        System.out.println("username:" + name);
        return user;
    }
}
