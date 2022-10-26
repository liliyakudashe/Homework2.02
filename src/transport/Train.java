package transport;

public class Train extends Transport {
    private double thePriceOfTheTrip; // Цена поездки
    private String travelTime;//Время поездки
    private String nameOfTheDepartureStation;//Название станции отбытия
    private String finalStop;//Конечная остановка
    private int numberOfWagons;//Количество вагонов

    public Train(String stamp, String model, int yearOfProduction, String countryOfAssembly, String bodyColor, double maximumSpeed, double thePriceOfTheTrip, String travelTime, String nameOfTheDepartureStation, String finalStop, int numberOfWagons) {
        super(stamp, model, yearOfProduction, countryOfAssembly, bodyColor, maximumSpeed);
        this.thePriceOfTheTrip = Math.max(numberOfWagons, 0);
        this.travelTime = defaultValid(travelTime, "Информация не указана");
        this.nameOfTheDepartureStation = defaultValid(nameOfTheDepartureStation, "Информация не указана");
        this.finalStop = defaultValid(finalStop, "Информация не указана");
        this.numberOfWagons = Math.max(numberOfWagons, 0);
    }


    @Override
    protected void refill() {
        System.out.println("Поезд нужно заправлять дизелем");
    }

    @Override
    public String toString() {
        return "Поезд " + getStamp() + ", модель " + getModel() +
                ", год выпуска " + getYearOfProduction() + " в " + getCountryOfAssembly() +
                ", максимальная скорость передвижения " + getMaximumSpeed()+
                ". Цена поездки " + thePriceOfTheTrip +
                ", время поездки " + travelTime +
                ". Название станции отбытия " + nameOfTheDepartureStation +
                ", конечная остановка " + finalStop +
                ". Количество вагонов " + numberOfWagons;
    }

    public double getThePriceOfTheTrip () {
            return thePriceOfTheTrip;
        }

        public void setThePriceOfTheTrip ( double thePriceOfTheTrip){
            this.thePriceOfTheTrip = Math.max(numberOfWagons, 0);
        }

        public String getTravelTime () {
            return travelTime;
        }

        public void setTravelTime (String travelTime){
            this.travelTime = defaultValid(travelTime, "Информация не указана");
        }

        public String getNameOfTheDepartureStation () {
            return nameOfTheDepartureStation;
        }

        public void setNameOfTheDepartureStation (String nameOfTheDepartureStation){
            this.nameOfTheDepartureStation = defaultValid(nameOfTheDepartureStation, "Информация не указана");
        }

        public String getFinalStop () {
            return finalStop;
        }

        public void setFinalStop (String finalStop){
            this.finalStop = defaultValid(finalStop, "Информация не указана");
        }

        public int getNumberOfWagons () {
            return numberOfWagons;
        }

        public void setNumberOfWagons ( int numberOfWagons){
            this.numberOfWagons = Math.max(numberOfWagons, 0);
        }
    }

