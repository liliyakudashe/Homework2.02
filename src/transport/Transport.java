package transport;

import java.util.Objects;

public abstract class Transport {

    private String infoNotTransport = "Информация не указана";
    private double maxspeed; // максемальная скорость
    private String stamp; //марка
    private String model; //модель
    private double engineCapacity;// объем двигателя
    public boolean theCarBroke = true;//машина сломалась

    public Transport(String stamp, String model, double engineCapacity, double maxspeed) {
        this.stamp = defaultValid(stamp, "Default");
        this.model = defaultValid(model, "Default");
        this.engineCapacity = Math.max(engineCapacity, 0);
        this.maxspeed = Math.max(engineCapacity, 0);
    }

    public String defaultValid (String valid, String defaul){
        if (valid == null || valid.isBlank()){
            return defaul;
        } else {
            return valid;
        }
    }

    public abstract void startMoving();//начать движение

    public abstract void finishTheMovement(); //закончить движение

    public abstract void determineTheTypeOfCar(); // определить тип автомобиля

    public abstract boolean passDiagnostics(); // пройти диагностику

    public String getStamp() {
        return stamp;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = Math.max(engineCapacity, 0);
    }

    public double getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(double maxspeed) {
        this.maxspeed = Math.max(engineCapacity, 0);
    }

    public String getInfoNotTransport() {
        return infoNotTransport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineCapacity, engineCapacity) == 0 && Objects.equals(stamp, transport.stamp) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stamp, model, engineCapacity);


    }
}
