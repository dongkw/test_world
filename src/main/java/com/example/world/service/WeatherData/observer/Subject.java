package com.example.world.service.WeatherData.observer;


/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午5:34
 */
public interface Subject {

  void registerObserver(Observer o);

  void removeObserver(Observer o);

  void notifyObserver();
}
