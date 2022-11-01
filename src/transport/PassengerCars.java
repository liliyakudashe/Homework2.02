package transport;//легковые

public class PassengerCars extends Transport implements Competing {

    private BodyTypeCars bodyTypeCars;

    public PassengerCars(String stamp, String model, double engineCapacity, double maxspeed, BodyTypeCars bodyTypeCars) {
        super(stamp, model, engineCapacity, maxspeed);
        this.bodyTypeCars = bodyTypeCars;
    }

    public BodyTypeCars getBodyTypeCars() {
        return bodyTypeCars;
    }

    @Override
    public void determineTheTypeOfCar() {
        if (bodyTypeCars == null){
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Тип кузова авто " + bodyTypeCars.getTypeOfCarPassengers());
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
    public double maximumSpeed(double maximum) {

        return maximum;
    }

    @Override
    public void startMoving() {
        System.out.println("Легковой автомобиль, модель: "+ getStamp()+ " " +getModel()+ ", начал движение.");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Легковой автомобиль, модель: "+ getStamp()+ " "+ getModel() +  ", закончил движенеие.");
    }

    @Override
    public String toString() {
        return "Легковой автомобиль, модель: " + getModel() + ", марка "+ getStamp()+", объём двигателя "+getEngineCapacity()+"л.";
    }
}
