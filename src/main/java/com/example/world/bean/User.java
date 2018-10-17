package com.example.world.bean;

import lombok.Data;


/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/7/26 上午9:35
 */
@Data
public class User {

  private Long id;
  private String name;
  private String pwd;
  private Long deptId;
}
