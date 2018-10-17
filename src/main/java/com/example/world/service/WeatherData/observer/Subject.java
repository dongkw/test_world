package com.example.world.service.WeatherData.observer;


/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午5:34
 */
public interface Subject {

  public void registerObserver(Observer o);

  public void removeObserver(Observer o);

  public void notifyObserver();
}
