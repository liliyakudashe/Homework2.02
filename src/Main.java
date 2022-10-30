import transport.Bus;
import transport.PassengerCars;
import transport.Trucks;

public class Main {
    public static void main(String[] args) {

        PassengerCars audi = new PassengerCars("Audi A8 50 L TDI", "quattro", 5.2,  258.68);
        PassengerCars bmw = new  PassengerCars("BMW", "Z8", 2.5, 260.89);
        PassengerCars kia = new PassengerCars("Kia", "Sportage 4-го поколения", 5.2, 230.50);
        PassengerCars hyundai = new PassengerCars("Hyundai", "Avante", 2.5, 240.87);

        audi.startMoving();
        System.out.println(audi);
        audi.finishTheMovement();

        Bus ikarus = new Bus("Икарус", "280", 3.5,  150.23);
        Bus pas = new Bus("ПАЗ", "3205", 2.3, 160.52);
        Bus las = new Bus("Лаз", "699", 2.5, 170.81);
        Bus mersedes = new Bus("Мерседес", "856", 5.6,200.97);

        ikarus.startMoving();
        System.out.println(ikarus);
        ikarus.finishTheMovement();
        ikarus.pitStop();

        Trucks chery = new Trucks("Чери","589", 9.5, 260.88);
        Trucks kamaz = new Trucks("Камаз", "586", 5.5, 200.90);
        Trucks mazda = new Trucks("Мазда", "968", 8.4, 240.87);
        Trucks chevrolet = new Trucks("Шевролет", "458", 9.5,220.56);

        chery.startMoving();
        System.out.println(chery);
        chery.finishTheMovement();

        CategoryCDriver fernando = new CategoryCDriver("Алонсо", "Фернандо", null, true, 5.2);
        fernando.driverC(chery);

    }
}