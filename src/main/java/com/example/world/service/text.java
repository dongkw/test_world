package com.example.world.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/11/28 下午3:28
 */
public class text {

  public static void main(String[] args) {
    String str="\"id\": 134123412";
    Pattern pattern = Pattern.compile("id*");
    Matcher matcher = pattern.matcher(str);
    if(matcher.find())
      System.out.println(matcher.group());

  }
}
