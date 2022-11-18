package transport;

public enum Capacity {
        ESPECIALLY_SMALL("особо малая (до 10 мест)"),
        SMALL("малая (до 25 мест)"),
        AVERAGE("средняя (40–50 мест)"),
        BIG("большая (60–80 мест)"),
        ESPECIALLY_BIG("особо большая (100–120 мест)");

        private String typeOfCarBus; //тип авто

        Capacity(String typeOfCarBus) {
                this.typeOfCarBus = typeOfCarBus;
            }

    public String getTypeOfCarBus() {
        return typeOfCarBus;
    }
    }

