
import allDrivers.CategoryBDriver;
import allDrivers.CategoryCDriver;
import allDrivers.CategoryDDriver;
import allDrivers.Driver;
import transport.*;

import transport.Bus;
import transport.PassengerCars;
import transport.Trucks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


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

        Mechanic<PassengerCars> carrier = new Mechanic<>("Уиллис", "Кэрриер","Tesla");
        Mechanic<Trucks> tesla = new Mechanic<>("Никола", "Тесла", "Tesla");
        Mechanic<Bus> diesel = new Mechanic<>("Рудольф", "Дизель","Tesla");
        Mechanic<Transport> nye = new Mechanic<>("Билл", "Ной", "Tesla");


        chery.startMoving();
        System.out.println(chery);
        chery.finishTheMovement();

        CategoryCDriver fernando = new CategoryCDriver("Алонсо", "Фернандо", null, true, 5.2,chery );
        CategoryBDriver adams = new CategoryBDriver("Адамс", "Ник", null, true, 7.8,bmw);
        CategoryDDriver kris = new CategoryDDriver("Майкл", "Крисс", null, true, 5.5,mersedes);
        CategoryBDriver dibli = new CategoryBDriver("Дибли", "Хбю", null, true, 8.3,hyundai);

        Sponsor<Bus> ingata = new Sponsor<>("Игната", 1000000);
        Sponsor<Trucks> powerWheel = new Sponsor<>("Силовое колесо", 5000000);
        Sponsor<PassengerCars> dasviano = new Sponsor<>("Дасвиано", 2000000);
        Sponsor<Transport> gupanoRacing = new Sponsor<>("Гонки в Гупано", 3000000);

        fernando.driverC(chery);
        audi.addDriver(adams);
        audi.addMechanic(carrier);
        audi.addSponsor(dasviano);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.addPassengerCars(audi);
        serviceStation.service();

        Set<Sponsor> sponsors = new HashSet<>();
        sponsors.add(ingata);
        sponsors.add(powerWheel);
        sponsors.add(dasviano);
        sponsors.add(gupanoRacing);
        sponsors.add(gupanoRacing);
        System.out.println(sponsors);

        Set<Transport> transports = new HashSet<>();
        transports.add(audi);
        transports.add(kia);
        transports.add(hyundai);
        transports.add(hyundai);
        System.out.println(transports);

        Set<Driver> drivers = new HashSet<>();
        drivers.add(fernando);
        drivers.add(adams);
        drivers.add(kris);
        drivers.add(dibli);
        drivers.add(dibli);
        System.out.println(drivers);


    }
    public static void print(Transport transport){
        System.out.println("Информая о автомобиле " + transport.getStamp() + " " + transport.getModel());
        System.out.print("Водитель " );
        for (Driver<?> driver:transport.getDrivers()){
            System.out.println(driver.getName()+" " +driver.getSurname());
        }
        System.out.print("Спонсор ");
        for (Sponsor<?> sponsor:transport.getSponsors()){
            System.out.println(sponsor.getName()+ " " + sponsor.getAmountOfSupport());
        }
        System.out.print("Механик ");
        for (Mechanic<?> mechanic:transport.getMechanics()){
            System.out.println(mechanic.getName() + " " + mechanic.getSurname());
        }
    }
}