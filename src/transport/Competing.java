package transport;

public interface Competing {//Соревнующийся

    void pitStop();//питстоп
    double bestLapTime(double intervalCircus);//Лучшее время круга
    double maximumSpeed(double interval);//Максимальная скорость
}
