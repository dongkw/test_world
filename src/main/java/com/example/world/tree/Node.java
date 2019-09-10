package com.example.world.tree;

import lombok.Data;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2019/7/3 下午4:33
 */
@Data
public class Node {

  private Integer key;
  private String data;
  private Node left;
  private Node right;
}
