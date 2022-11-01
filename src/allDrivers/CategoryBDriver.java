package allDrivers;

import transport.PassengerCars;
import transport.Transport;

public class CategoryBDriver extends Driver<PassengerCars> {



    public CategoryBDriver(String surname, String name, String patronymic, boolean thePresenceOfADriversLicense, double experience) {
        super(surname, name, patronymic, thePresenceOfADriversLicense, experience);
    }

    public void driverB (PassengerCars cars){
        System.out.println("Водитель категории В "+ getName()+" "+getSurname()+ " управляет автомобилем " +cars.getStamp()+" "+ cars.getModel()+ " и будет участвовать в заезде");
    }

    @Override
    public void startMovingDriver() {
        System.out.println("Водитель "+ getSurname() + " " + getName()+ ", начал движение.");
    }

    @Override
    public void finishTheMovementDriver() {
        System.out.println("Водитель "+ getSurname() + " " + getName()+  ", закончил движение.");
    }

    @Override
    public void refillDriver() {
        if (!isPetrol()) {
            System.out.println("Требуется заправка!");
        }
    }
}
