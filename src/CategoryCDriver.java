import transport.Trucks;

public class CategoryCDriver extends Driver<Trucks> {
    public CategoryCDriver(String surname, String name, String patronymic, boolean thePresenceOfADriversLicense, double experience) {
        super(surname, name, patronymic, thePresenceOfADriversLicense, experience);
    }

    public void driverC(Trucks trucks){
        System.out.println("Водитель категории С "+ getName()+" "+getSurname()+" управляет автомобилем " + trucks.getStamp()+" "+trucks.getModel()+ " и будет участвовать в заезде");
    }

    @Override
    public void startMovingDriver() {
            System.out.println("Водитель "+ getSurname() + " " + getName()+ ", начал движение.");
    }// начать движение

    @Override
    public void finishTheMovementDriver() {
        System.out.println("Водитель "+ getSurname() + " " + getName()+  ", закончил движение.");
    }// закончить движение

    @Override
    public void refillDriver() {
        if (!isPetrol()) {
            System.out.println("Требуется заправка!");
        }
    }// заправка

}
