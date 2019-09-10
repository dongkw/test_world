package com.example.world.tree;

import java.util.Objects;
import lombok.Data;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2019/7/3 下午4:08
 */
@Data
public class Tree {

  private Node root;

  public Tree() {
  }

  public void insert(int key, String data) {

    Node current = new Node();
    current.setKey(key);
    current.setData(data);
    if (Objects.isNull(root)) {
      root = current;
    } else {
      Node parent = root;
      while (true) {
        if (key < parent.getKey()) {
          if (Objects.isNull(parent.getRight())) {
            parent.setRight(current);
            break;
          } else {
            parent = parent.getRight();
          }
        } else {
          if (Objects.isNull(parent.getLeft())) {
            parent.setLeft(current);
            break;
          } else {
            parent = parent.getLeft();
          }
        }
      }
    }
  }

  public String find(int key) {

    Node parent = root;
    while (Objects.nonNull(parent)) {
      if (parent.getKey() == key) {
        return parent.getData();
      } else {
        if (key < parent.getKey()) {
          parent = parent.getRight();
        } else {
          parent = parent.getLeft();
        }
      }
    }
    return "没有";
  }

  private String delete(int key) {
    Node parent = root;
    while (Objects.nonNull(parent)) {
      if (parent.getKey() == key) {
        if (Objects.isNull(parent.getRight())&&Objects.isNull(parent.getLeft())){



        }


      } else {
        if (key < parent.getKey()) {
          parent = parent.getRight();
        } else {
          parent = parent.getLeft();
        }
      }
    }
    return "没有";
  }

}
