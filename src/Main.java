import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Car audi = new Car("Audi A8 50 L TDI",
                "quattro",
                2020 ,
                3.0,
                "чёрный",
                365,
                "Германия",
                "механика",
                "седан",
                "B698LO235",
                5,
                true,
                new Car.Key(false, false) ,
                new Car.Insurance(LocalDate.now().plusMonths(3),1500.5f, "254698753"));

        Car bmw = new Car("BMW",
                "Z8",
                2021,
                4.0,
                "чёрный",
                652,
                "Германия",
                "автомат",
                "универсал",
                "B458UY698",
                6,
                true,
                new Car.Key(true, false),
                new Car.Insurance(LocalDate.now().plusMonths(5),2500.5f, "236598745"));
        Car kia = new Car("Kia",
                "Sportage 4-го поколения",
                2018,
                1.4,
                "красный",
                250,
                "Южная Корея",
                "механика",
                "хэчбэк",
                "M258KI369",
                5,
                false,
                new Car.Key(false, true),
                new Car.Insurance(LocalDate.now().plusMonths(15),8500.8f, "896521357"));
        Car hyundai = new Car("Hyundai",
                "Avante",
                2016,
                1.6,
                "оранжевый",
                300,
                "Южная Корея",
                "автомат",
                "кроссовер",
                "K698IU125",
                8,
                true,
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(1),6391.85f, "587963214"));

        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println(hyundai);

        Train swallow = new Train("Ласточка",
                " B-901",
                2011,
                "Россия",
                null,
                301,
                3500.0,
                null,
                " Белорусского вокзала",
                "Минск-Пассажирский",
                11);

        Train leningrad = new Train("Ленинград",
                " B-125",
                2019,
                "Россия",
                null,
                270,
                1700.0,
                null,
                "Ленинградского вокзала",
                "Ленинград-Пассажирский",
                8);

        System.out.println(swallow);
        System.out.println(leningrad);

        Bus ikarus = new Bus("Икарус", "280",
                1998,
                "Германия",
                "красный",
                100);
        Bus pas = new Bus("ПАЗ",
                "3205",
                1856,
                "Россия",
                "белый",
                60);

        Bus las = new Bus("Лаз",
                "699",
                1978,
                "Россия",
                "зелёный",
                50);
        System.out.println(ikarus);
        System.out.println(pas);
        System.out.println(las);


    }
}