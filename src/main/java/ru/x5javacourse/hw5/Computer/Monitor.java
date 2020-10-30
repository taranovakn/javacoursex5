package ru.x5javacourse.hw5.Computer;

public class Monitor implements Component{
    private double monitorSize;
    private String monitorManufacturer;

    public Monitor(double monitorSize, String monitorManufacturer) {
        this.monitorSize = monitorSize;
        this.monitorManufacturer = monitorManufacturer;
    }

    @Override
    public void start(){
        System.out.println("Монитор включен.");
    }

    @Override
    public String getInfo(){
        return "Параметры монитора: " + "производитель - " +
                monitorManufacturer + "; диагональ - " + monitorSize + ";";
    }
}
