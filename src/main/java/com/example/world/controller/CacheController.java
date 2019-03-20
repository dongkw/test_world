package com.example.world.controller;

import com.example.world.service.cache.Cache2Service;
import com.example.world.service.cache.Cache3Service;
import com.example.world.service.cache.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/12/20 下午4:27
 */
@RestController

public class CacheController {

  @Autowired
  private Cache2Service cache2Service;

  @Autowired
  private Cache3Service cache3Service;

  @GetMapping("aa")
  public ResponseEntity todo() {
//    cache3Service.asc();
    cache2Service.aa();
    return ResponseEntity.ok(null);
  }

  @GetMapping("rm")
  public ResponseEntity rm() {
    cache2Service.rm();
    return ResponseEntity.ok(null);
  }
}
