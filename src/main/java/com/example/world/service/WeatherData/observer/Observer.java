package com.example.world.service.WeatherData.observer;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午5:36
 */
public interface Observer {

  void update(float temp, float humidity, float pressure);
}
