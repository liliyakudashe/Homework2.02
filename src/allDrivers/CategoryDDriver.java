package allDrivers;

import transport.Bus;
import transport.Trucks;

public class CategoryDDriver extends Driver<Bus> {

    public CategoryDDriver(String surname, String name, String patronymic, boolean thePresenceOfADriversLicense, double experience) {
        super(surname, name, patronymic, thePresenceOfADriversLicense, experience);
    }

    public void driverD(Trucks trucks){
        System.out.println("Водитель категории D "+ getName()+" "+getSurname()+" управляет автомобилем " + trucks.getStamp()+" "+trucks.getModel()+ " и будет участвовать в заезде");
    }

    @Override
    public void startMovingDriver() {
        System.out.println("Водитель "+ getSurname() + " " + getName()+ " " + getPatronymic() + ", начал движение.");
    }// начать движение

    @Override
    public void finishTheMovementDriver() {
        System.out.println("Водитель "+ getSurname() + " " + getName()+ " " + getPatronymic() + ", закончил движение.");
    }// закончить движение

    @Override
    public void refillDriver() {
        if (!isPetrol()) {
            System.out.println("Требуется заправка!");
        }
    }// заправка

}
