
import allDrivers.CategoryCDriver;
import transport.*;

import transport.Bus;
import transport.PassengerCars;
import transport.Trucks;


public class Main {
    public static void main(String[] args) throws IllegalAccessException {


        PassengerCars audi = new PassengerCars("Audi A8 50 L TDI", "quattro", 5.2,  258.68, BodyTypeCars.PICKUP_TRUCK);
        PassengerCars bmw = new  PassengerCars("BMW", "Z8", 2.5, 260.89, BodyTypeCars.VAN);
        PassengerCars kia = new PassengerCars("Kia", "Sportage 4-го поколения", 5.2, 230.50,BodyTypeCars.HATCHBACK);
        PassengerCars hyundai = new PassengerCars("Hyundai", "Avante", 2.5, 240.87, BodyTypeCars.VAN);



        audi.startMoving();
        System.out.println(audi);
        audi.finishTheMovement();


        Bus ikarus = new Bus("Икарус", "280", 3.5,  150.23, Capacity.SMALL );
        Bus pas = new Bus("ПАЗ", "3205", 2.3, 160.52, Capacity.AVERAGE);
        Bus las = new Bus("Лаз", "699", 2.5, 170.81, Capacity.BIG);
        Bus mersedes = new Bus("Мерседес", "856", 5.6,200.97,Capacity.ESPECIALLY_BIG);



        ikarus.startMoving();
        System.out.println(ikarus);
        ikarus.finishTheMovement();


        Trucks chery = new Trucks("Чери","589", 9.5, 260.88, LoadCapacity.N2);
        Trucks kamaz = new Trucks("Камаз", "586", 5.5, 200.90, LoadCapacity.N3);
        Trucks mazda = new Trucks("Мазда", "968", 8.4, 240.87, LoadCapacity.N1);
        Trucks chevrolet = new Trucks("Шевролет", "458", 9.5,220.56, LoadCapacity.N1);



        chery.startMoving();
        System.out.println(chery);
        chery.finishTheMovement();

        CategoryCDriver fernando = new CategoryCDriver("Алонсо", "Фернандо", null, true, 5.2,chery );
        fernando.driverC(chery);


    }
}