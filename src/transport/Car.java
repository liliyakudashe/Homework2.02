package transport;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Car extends Transport {

    public static class Key {
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

    public static class Insurance {
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

        public boolean isInsuranceCheck() {
            return insuranceNumber.length() == 9;
        }

        public boolean isCheckingInsuranceForDelay() {
            return LocalDate.now().isBefore(this.theValidityPeriodOfTheInsurance);
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

    double engineCapacityInLiters;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private boolean summerOrWinterTires;
    private final Key key;
    private final Insurance insurance;

    public Car(String stamp, String model, int yearOfProduction, double engineCapacityInLiters, String bodyColor, double maximumSpeed, String countryOfAssembly, String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean summerOrWinterTires, Key key, Insurance insurance) {
        super(stamp, model, yearOfProduction, countryOfAssembly, bodyColor, maximumSpeed);
        this.engineCapacityInLiters = engineCapacityInLiters >= 0 ? engineCapacityInLiters: 1.5;
        this.transmission = defaultValid(transmission, "Информация не указана");
        this.bodyType = defaultValid(bodyType, "Информация не указана");
        this.registrationNumber = defaultValid(registrationNumber, "Информация не указана");
        this.numberOfSeats = Math.max(numberOfSeats, 0);
        this.summerOrWinterTires = summerOrWinterTires;
        this.key = key;
        this.insurance = insurance;
    }

    public void changeTiresForSeasonalOnes() {
        int season = LocalDate.now().getMonthValue();
        this.summerOrWinterTires = season <= 4 || season >= 11;
    }

    public boolean isRegistrationNumber() {
        if (this.registrationNumber.length() != 9) {
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

    private boolean isNumbers(char symbols) {
        String checkingCharacters = "ASDFGHJKLZXCVBNMPOIUYTREWQ";
        return checkingCharacters.contains("" + symbols);
    }

    @Override
    public String toString() {
        return " Марка машины " + getStamp() +
                ", модель " + getModel() +
                ", объём двигателя " + engineCapacityInLiters +
                ", цвет кузова " + getBodyColor() +
                ", год производства " + getYearOfProduction() +
                ", страна сборки " + getCountryOfAssembly() +
                ", коробка передач " + transmission +
                ", тип кузова " + bodyType +
                ", регистрационный номер " + registrationNumber +
                ", количество мест " + numberOfSeats +
                ", признак \"Летняя\" или \"Зимняя\" резина " + summerOrWinterTires;
    }

    @Override
    public void refill() {
        System.out.println("Машину можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар.");
    }

    public double getEngineCapacityInLiters() {
        return engineCapacityInLiters;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getTransmission () {
            return transmission;
        }

        public void setTransmission (String transmission){
            this.transmission = defaultValid(transmission, "Default");
        }

        public String getBodyType () {
            return bodyType;
        }

        public void setRegistrationNumber (String registrationNumber){
            if (this.registrationNumber.length() != 9) {
                this.registrationNumber = registrationNumber;
            }
        }

        public int getNumberOfSeats () {
            return numberOfSeats;
        }

        public boolean getSummerOrWinterTires () {
            return summerOrWinterTires;
        }

        public void setSummerOrWinterTires ( boolean summerOrWinterTires){
            this.summerOrWinterTires = summerOrWinterTires;
        }

        public Key getKey () {
            return key;
        }

        public Insurance getInsurance () {
            return insurance;
        }
    }

