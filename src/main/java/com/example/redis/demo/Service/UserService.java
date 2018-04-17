package com.example.redis.demo.Service;

import com.example.redis.demo.Dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserDao userDao;

    public String getUserNameById(long id) {
        return userDao.selectNameById(id);
    }
}
