package transport; //грузовые

public class Trucks extends Transport implements Competing{

    private LoadCapacity loadCapacity;
    public Trucks(String stamp, String model, double engineCapacity, double maxspeed, LoadCapacity loadCapacity) {
        super(stamp, model, engineCapacity, maxspeed);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void determineTheTypeOfCar() {
        if (loadCapacity == null){
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип грузоподъемности " + loadCapacity.getTypeOfCarTrucks());
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
    public void startMoving() {
        System.out.println("Грузовой автомобиль, модель: "+ getStamp()+ " " +getModel()+ ", начал движение.");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Грузовой автомобиль, модель: "+ getStamp()+ " "+ getModel() +  ", закончил движенеие.");
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль, модель: " + getModel() + ", марка "+ getStamp()+", объём двигателя "+getEngineCapacity()+"л.";
    }
}
