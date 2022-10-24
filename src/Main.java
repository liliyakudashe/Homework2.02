import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car ladaGranta = new Car("Lada",
                "Granta",
                1.7,
                "жёлтый",
                2015,
                "Россия",
                "автомат",
                "минивэн",
                "C258BN879",
                8,
                true,
                new Car.Key(true,true) ,
                new Car.Insurance(LocalDate.now().plusMonths(6),1500.5f, "589632145"));
        Car audi = new Car("Audi A8 50 L TDI",
                "quattro", 3.0,
                "чёрный",
                2020,
                "Германия",
                "механика",
                "седан",
                "B698LO235",
                5,
                false,
                new Car.Key(false, false) ,
                new Car.Insurance(LocalDate.now().plusMonths(3),1500.5f, "254698753"));
        Car bmw = new Car("BMW",
                "Z8",
                3.0,
                "чёрный",
                2021,
                "Германия",
                "автомат",
                "универсал",
                "B458UY698",
                4,
                true,
                new Car.Key(true, false),
                new Car.Insurance(LocalDate.now().plusMonths(5),2500.5f, "236598745"));
        Car kia = new Car("Kia",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея",
                "механика",
                "хэтчбек",
                "M258KI369",
                5,
                false,
                new Car.Key(false, true),
                new Car.Insurance(LocalDate.now().plusMonths(15),8500.8f, "896521357"));
        Car hyundai = new Car("Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея",
                "автомат",
                "кроссовер",
                "K698IU125",
                8,
                true,
                new Car.Key(true, true),
                new Car.Insurance(LocalDate.now().plusMonths(1),6391.85f, "587963214"));


        System.out.println(ladaGranta);
        if (!ladaGranta.getInsurance().isInsuranceCheck()){
            Car.print(ladaGranta.getInsurance().getInsuranceNumber());
        }
        System.out.println(audi);
        if (!audi.getInsurance().isInsuranceCheck()){
            Car.print(ladaGranta.getInsurance().getInsuranceNumber());
        }
        System.out.println(bmw);
        if (!bmw.getInsurance().isInsuranceCheck()){
            Car.print(ladaGranta.getInsurance().getInsuranceNumber());
        }
        System.out.println(kia);
        if (!kia.getInsurance().isInsuranceCheck()){
            Car.print(ladaGranta.getInsurance().getInsuranceNumber());
        }
        System.out.println(hyundai);
        if (!hyundai.getInsurance().isInsuranceCheck()){
            Car.print(ladaGranta.getInsurance().getInsuranceNumber());
        }



    }
}