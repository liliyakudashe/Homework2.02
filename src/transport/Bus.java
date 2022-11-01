package transport;

import static java.lang.Character.isDigit;


public class Bus extends Transport implements Competing {

    private Capacity capacity;
    public Bus(String stamp, String model, double engineCapacity, double maxspeed, Capacity capacity) {
        super(stamp, model, engineCapacity, maxspeed);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    @Override
    public void determineTheTypeOfCar() {
        if (capacity == null){
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип вместимости " + capacity.getTypeOfCarBus());
        }
    }

    @Override
    public void pitStop() {
        if (!theCarBroke)
            System.out.println(getStamp()+ " "+ getModel()+ " требуется быстрый ремонт и проверка технического состояния машины.");
    }

    @Override
    public double bestLapTime(double intervalCircus) {
        double maxTime = Integer.MIN_VALUE;
        maxTime = getMaxspeed()/intervalCircus;
        System.out.println("Лучшее время круга " + getModel() + " " + getStamp());
        return maxTime;
    }
    @Override
    public double maximumSpeed(double interval) {
        double val = this.getMaxspeed() * interval;
        return val;
    }

    @Override
    public void startMoving () {
        System.out.println("Автобус, модель: " + getStamp() + " " + getModel() + ", начал движение.");
    }

    @Override
    public void finishTheMovement () {
        System.out.println("Автобус, модель: " + getStamp() + " " + getModel() + ", закончил движенеие.");
    }

    @Override
    public String toString () {
        return "Автобус, модель: " + getModel() + ", марка " + getStamp() + ", объём двигателя " + getEngineCapacity() + "л.";
    }


}


