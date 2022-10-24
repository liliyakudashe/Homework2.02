package transport;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Car {

    public static class Key{
        private final boolean remoteEngineStart;
        private final boolean keylessAaccess;

        public Key(boolean remoteEngineStart, boolean keylessAaccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAaccess = keylessAaccess;
        }

        public boolean getRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean getKeylessAaccess() {
            return keylessAaccess;
        }
    }

    public static class Insurance{
        private final LocalDate theValidityPeriodOfTheInsurance;
        private final float theCostOfInsurance;
        private final String insuranceNumber;

        public Insurance(LocalDate theValidityPeriodOfTheInsurance, float theCostOfInsurance, String insuranceNumber) {
            this.theValidityPeriodOfTheInsurance = theValidityPeriodOfTheInsurance != null ? theValidityPeriodOfTheInsurance : LocalDate.now().plusDays(10);
            this.theCostOfInsurance = Math.max(theCostOfInsurance, 1f);
            if (insuranceNumber == null || insuranceNumber.isBlank()) {
                this.insuranceNumber = "Default";
            } else {
                this.insuranceNumber = insuranceNumber;
            }
        }

        public boolean isInsuranceCheck(){
            return insuranceNumber.length() == 9;
        }

        public boolean isCheckingInsuranceForDelay(){
            return  LocalDate.now().isBefore(this.theValidityPeriodOfTheInsurance);
        }

        public LocalDate getTheValidityPeriodOfTheInsurance() {
            return theValidityPeriodOfTheInsurance;
        }

        public float getTheCostOfInsurance() {
            return theCostOfInsurance;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }
    }



    private String stamp;
    private String model;
    private double engineCapacityInLiters;
    private String bodyColor;
    private int yearOfProduction;
    private String countryOfAssembly;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean summerOrWinterTires;
    private final Key key;
    private final Insurance insurance;

   public Car(String stamp,
              String model,
              double engineCapacityInLiters,
              String bodyColor,
              int yearOfProduction,
              String countryOfAssembly,
              String transmission,
              String bodyType,
              String registrationNumber,
              int numberOfSeats,
              boolean summerOrWinterTires,
              Key key,
              Insurance insurance) {
        this.stamp = defaultValid(stamp, "Default");
        this.model = defaultValid(model, "Default");
        this.engineCapacityInLiters = engineCapacityInLiters >= 0 ? engineCapacityInLiters: 1.5;
        this.bodyColor = defaultValid(bodyColor, "Белый");
        this.yearOfProduction = yearOfProduction >= 0? yearOfProduction:2000;
        this.countryOfAssembly = defaultValid(countryOfAssembly, "Default");
        this.transmission = defaultValid(transmission, "Default");
        this.bodyType = defaultValid(bodyType, "Default");
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.summerOrWinterTires = summerOrWinterTires;
        this.key = key;
        this.insurance = insurance;
    }

    public void changeTiresForSeasonalOnes(){
        int season = LocalDate.now().getMonthValue();
        this.summerOrWinterTires = season <= 4 || season >= 11;
    }

    public boolean isRegistrationNumber(){
        if (this.registrationNumber.length() != 9){
            return false;
        }

        char[] registrationNumberChar = this.registrationNumber.toCharArray();
        return isNumbers(registrationNumberChar[0])
                && isNumber(registrationNumberChar[1])
                && isNumber(registrationNumberChar[2])
                && isNumber(registrationNumberChar[3])
                && isNumbers(registrationNumberChar[4])
                && isNumbers(registrationNumberChar[5])
                && isNumber(registrationNumberChar[6])
                && isNumber(registrationNumberChar[7])
                && isNumber(registrationNumberChar[8]);
    }

    private boolean isNumber(char symbols) {
       return Character.isDigit(symbols);
    }

    private boolean isNumbers(char symbols){
       String checkingCharacters = "ASDFGHJKLZXCVBNMPOIUYTREWQ";
       return checkingCharacters.contains(""+symbols);
    }

    private String defaultValid (String valid, String defaul){
        if (valid == null || valid.isBlank()){
            return defaul;
        } else {
            return valid;
        }
    }

    @Override
    public String toString() {
        return " Марка машины " + stamp +
                ", модель " + model +
                ", объём двигателя " + engineCapacityInLiters +
                ", цвет кузова " + bodyColor +
                ", год производства " + yearOfProduction +
                ", страна сборки " + countryOfAssembly +
                ", коробка передач " + transmission +
                ", тип кузова " + bodyType +
                ", регистрационный номер " + registrationNumber +
                ", количество мест " + numberOfSeats +
                ", признак \"Летняя\" или \"Зимняя\" резина " + summerOrWinterTires +
                ". Удаленный запуск двигателя " + key +
                ", cтраховка" + insurance;
    }

    public static void print(String overdue){
        System.out.println(" Страховка просрочена");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.engineCapacityInLiters, engineCapacityInLiters) == 0 && yearOfProduction == car.yearOfProduction && Objects.equals(stamp, car.stamp) && Objects.equals(model, car.model) && Objects.equals(bodyColor, car.bodyColor) && Objects.equals(countryOfAssembly, car.countryOfAssembly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stamp, model, engineCapacityInLiters, bodyColor, yearOfProduction, countryOfAssembly);
    }


    public String getStamp() {
        return stamp;
    }

    public String getModel() {
        return model;
    }

    public double getEngineCapacityInLiters() {
        return engineCapacityInLiters;
    }

    public void setEngineCapacityInLiters(double engineCapacityInLiters) {
       this.engineCapacityInLiters = engineCapacityInLiters >= 0 ? engineCapacityInLiters: 1.5;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = defaultValid(bodyColor, "Белый");
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getCountryOfAssembly() {
        return countryOfAssembly;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = defaultValid(transmission, "Default");
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (this.registrationNumber.length() != 9) {
            this.registrationNumber = registrationNumber;
        }
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean getSummerOrWinterTires() {
        return summerOrWinterTires;
    }

    public void setSummerOrWinterTires(boolean summerOrWinterTires) {
        this.summerOrWinterTires = summerOrWinterTires;
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }
}
