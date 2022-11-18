package transport;

public enum LoadCapacity {
    N1("N1 (с полной массой до 3,5 тонн)"),
    N2("N2 (с полной массой свыше 3,5 до 12 тонн)"),
    N3("N3 (с полной массой свыше 12 тонн)");

    private String typeOfCarTrucks;

    LoadCapacity(String typeOfCarTrucks) {
            this.typeOfCarTrucks = typeOfCarTrucks;
    }

    public String getTypeOfCarTrucks() {
        return typeOfCarTrucks;
    }

}
