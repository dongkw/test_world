package com.example.world.service.WeatherData.board;

import com.example.world.service.WeatherData.observer.DisplayElement;
import com.example.world.service.WeatherData.observer.Observer;
import com.example.world.service.WeatherData.observer.Subject;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午5:51
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

  private float temp;
  private float humidity;
  private Subject weatherData;

  public CurrentConditionsDisplay(
      Subject weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }

  @Override
  public void display() {
    System.out.println("Current Conditions：" + temp + "~~" + humidity);
  }

  @Override
  public void update(float temp, float humidity, float pressure) {
    this.temp = temp;
    this.humidity = humidity;
    display();
  }
}
