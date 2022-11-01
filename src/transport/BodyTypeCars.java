package transport;

public enum BodyTypeCars {
    SEDAN("Седан"),
    HATCHBACK("Хетчбек"),
    COMPARTENT("Купе"),
    STATION_WAGON("Универсал"),
    OFF_ROAD_VEHICLE("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP_TRUCK("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");
    private String typeOfCarPassengers;

    BodyTypeCars(String typeOfCarPassengers) {
            this.typeOfCarPassengers = typeOfCarPassengers;
    }

    public String getTypeOfCarPassengers() {
        return typeOfCarPassengers;
    }

}
