package ru.x5javacourse.hw5.Computer;

public class Monitor {
    private double monitorSize;
    private String monitorManufacturer;

    public Monitor(double monitorSize, String monitorManufacturer) {
        this.monitorSize = monitorSize;
        this.monitorManufacturer = monitorManufacturer;
    }

    public void startMonitor(){
        System.out.println("Монитор включен. Параметры: " + "производитель - " +
                monitorManufacturer + "; диагональ - " + monitorSize + ";");
    }

}
