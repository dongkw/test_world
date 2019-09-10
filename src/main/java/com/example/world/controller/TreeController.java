package com.example.world.controller;

import com.example.world.tree.Tree;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2019/7/3 下午4:22
 */
@RestController

public class TreeController {

  private Tree tree = new Tree();

  @PostMapping("/insert")
  public ResponseEntity<Tree> insert(@RequestParam("key") Integer key,
      @RequestParam("data") String data) {
    tree.insert(key, data);
    return ResponseEntity.ok(tree);

  }

  @PostMapping("/find")
  public ResponseEntity<String> find(@RequestParam("key") Integer key) {
    String t = tree.find(key);
    return ResponseEntity.ok(t);

  }


}
