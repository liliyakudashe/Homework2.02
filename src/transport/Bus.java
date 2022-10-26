package transport;

public class Bus extends Transport {
    public Bus(String stamp, String model, int yearOfProduction, String countryOfAssembly, String bodyColor, double maximumSpeed) {
        super(stamp, model, yearOfProduction, countryOfAssembly, bodyColor, maximumSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Автобус можно заправлять бензином или дизелем на заправке.");
    }

    @Override
    public String toString() {
        return "Автобус " + getStamp()+ ", модель " + getModel() + ", год выпуска " + getYearOfProduction()
                + ". Страна производства " + getCountryOfAssembly() + ", цвет " + getBodyColor()
                + ", максимальная скорость передвижения " + getMaximumSpeed();
    }
}