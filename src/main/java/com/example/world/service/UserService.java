package com.example.world.service;

import com.example.world.bean.User;
import com.example.world.config.ApplicationConfig;
import com.example.world.dao.UserDao;
import com.example.world.dao.mapper.UserMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/7/26 上午9:38
 */
@Service
public class UserService {

  @Autowired
  private UserDao userDao;
  @Autowired
  private UserMapper userMapper;

  public User getById(Long id) {
    return userDao.unique(id);
  }

  public List<User> getByName(String name) {
    return userDao.getByName(name);
  }

  public void add(User user) {
    userMapper.insert(user);
  }

  public void add2(User user) {
    userDao.insert(user);
  }
}
