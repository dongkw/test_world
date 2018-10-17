package com.example.world.service.WeatherData;

import com.example.world.service.WeatherData.observer.Observer;
import com.example.world.service.WeatherData.observer.Subject;
import java.util.ArrayList;

/**
 * @Author dkw[dongkewei@xinzhili.cn]
 * @data 2018/8/3 下午5:40
 */
public class WeatherDate implements Subject {

  private ArrayList<Observer> observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherDate() {
    observers = new ArrayList<>();
  }

  @Override
  public void registerObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    int i = observers.indexOf(o);
    if (i >= 0) {
      observers.remove(o);
    }
  }

  @Override
  public void notifyObserver() {
    observers.forEach(t -> {
      t.update(temperature, humidity, pressure);
    });
  }

  public void measurementsChanged() {
    notifyObserver();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

}
