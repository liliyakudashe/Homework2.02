package transport;

import static java.lang.Character.isDigit;


public class Bus extends Transport implements Competing {
    public Bus(String stamp, String model, double engineCapacity, double maxspeed) {
        super(stamp, model, engineCapacity, maxspeed);
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