package transport;

public abstract class Transport {
    private String stamp; //марка
    private String model; //модель
    private final int yearOfProduction; // год выпуска
    private final String countryOfAssembly; //страна производства
    private String bodyColor; // цвет кузова
    private double maximumSpeed; // максимальная скорость

    public Transport(String stamp, String model, int yearOfProduction, String countryOfAssembly, String bodyColor, double maximumSpeed) {
        this.stamp = defaultValid(stamp, "Default");
        this.model = defaultValid(model, "Default");
        this.yearOfProduction = yearOfProduction >= 0? yearOfProduction:2000;
        this.countryOfAssembly = defaultValid(countryOfAssembly, "Default");
        this.bodyColor = defaultValid(bodyColor, "Default");
        this.maximumSpeed = maximumSpeed;
    }

    public String defaultValid (String valid, String defaul){
        if (valid == null || valid.isBlank()){
            return defaul;
        } else {
            return valid;
        }
    }

    protected abstract void refill();

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = defaultValid(stamp, "Default");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = defaultValid(model, "Default");
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getCountryOfAssembly() {
        return countryOfAssembly;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = defaultValid(bodyColor, "Белый");
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }


}
