import java.util.Objects;

public class Car {

    private String stamp;
    private String model;
    private double engineCapacityInLiters;
    private String bodyColor;
    private int yearOfProduction;
    private String countryOfAssembly;

    Car(String stamp, String model, double engineCapacityInLiters, String bodyColor, int yearOfProduction, String countryOfAssembly){
        this.stamp = stamp;
        if (this.stamp == null){
            this.stamp = "Default";
        }
        this.model = model;
        if (this.model == null){
            this.model = "Default";
        }
        this. engineCapacityInLiters = engineCapacityInLiters;
        if (this.engineCapacityInLiters == 0.0){
            this.engineCapacityInLiters = 1.5;
        }
        this.bodyColor = bodyColor;
        if (this.bodyColor == null){
            this.bodyColor = "Белый";
        }
        this.yearOfProduction = yearOfProduction;
        if (this.yearOfProduction == 0){
            this.yearOfProduction = 2000;
        }
        this.countryOfAssembly = countryOfAssembly;
        if (this.countryOfAssembly == null){
            this.countryOfAssembly = "Default";
        }
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

    public String getBodyColor() {
        return bodyColor;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getCountryOfAssembly() {
        return countryOfAssembly;
    }

    @Override
    public String toString() {
        return stamp + " " + model + ", " + yearOfProduction + " год выпуска, " + "сборка в " + countryOfAssembly + ", " + bodyColor + " цвет кузова, " + "объем двигателя — " + engineCapacityInLiters + " л.";
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
}
