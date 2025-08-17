package BehaviouralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(float temp);
}

interface Subject{
    void attach(Observer obs);
    void detach(Observer obs);
    void notifyObservers();
}

class WeatherStationBD implements Subject{
    private float temperature;
    private List<Observer> observerList;

    public WeatherStationBD(){
        observerList = new ArrayList<>();
    }

    public void setTemperature(float temperature){
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void attach(Observer obs) {
        observerList.add((obs));
    }

    @Override
    public void detach(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs: observerList){
            obs.update(temperature);
        }
    }
}

class DisplayDeviceBD implements Observer{
    private String name;
    public DisplayDeviceBD(String deviceName){
        this.name = deviceName;
    }

    @Override
    public void update(float temp) {
        System.out.println("Temp on " + name +" device is "+temp);
    }
}

class MobileDevice implements Observer{

    @Override
    public void update(float temp) {
        System.out.println("Temp on mobile is "+temp);
    }

}

public class WithObserver {
    public static void main(String[] args) {
        WeatherStationBD weatherStationBD = new WeatherStationBD();

        DisplayDeviceBD deviceBD = new DisplayDeviceBD("Walton");
        MobileDevice mobileDevice = new MobileDevice();

        weatherStationBD.attach(deviceBD);
        weatherStationBD.attach(mobileDevice);

        weatherStationBD.setTemperature(25);

        weatherStationBD.detach(mobileDevice);
        
        weatherStationBD.setTemperature(19);
    }
}
