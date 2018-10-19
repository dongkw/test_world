package com.example.world.dao.mapper;

import com.example.world.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/10/19 下午4:54
 */
@Mapper
public interface UserMapper {
  @Insert("insert into user(name,pwd,dept_id) values(#{name},#{pwd},#{deptId})")
  void insert(User user);
}
