package com.example.world.controller;

import com.example.world.bean.User;
import com.example.world.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/7/26 上午9:41
 */
@RestController
@Api(value = "user", description = "user描述")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping("/user")
  public User getById(@RequestParam("id") Long id) {
    return userService.getById(id);
  }

  @GetMapping("/user/name")
  @ApiOperation(value = "模糊查询")
  public List<User> getByName(@RequestParam("name") String name) {
    return userService.getByName(name);
  }

  @PostMapping("/user")
  public ResponseEntity add(@RequestBody User user) {
    userService.add2(user);
    return ResponseEntity.ok("success");
  }
}
