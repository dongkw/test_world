package com.example.world.service.WeatherData.board;

import com.example.world.service.WeatherData.observer.DisplayElement;
import com.example.world.service.WeatherData.observer.Observer;
import com.example.world.service.WeatherData.observer.Subject;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午5:58
 */
public class StatisticsDisplay implements Observer, DisplayElement {

  private float temp;
  private float humidity;
  private float pressure;
  private Subject weatherData;

  public StatisticsDisplay(
      Subject weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("Statistics：" + temp + "~~" + humidity + "~~" + pressure);

  }


  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }
}
