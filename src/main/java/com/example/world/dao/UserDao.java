package com.example.world.dao;

import com.example.world.bean.User;
import java.util.List;
import org.beetl.sql.core.annotatoin.Param;
import org.beetl.sql.core.annotatoin.SqlResource;
import org.beetl.sql.core.mapper.BaseMapper;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/7/26 上午9:33
 */
@SqlResource("user")
public interface UserDao extends BaseMapper<User> {

  List<User> getByName(@Param("name") String name);
}
