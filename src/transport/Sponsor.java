package transport;

import java.util.Objects;

public class Sponsor <T extends Transport> {
    private final String name;
    private final int amountOfSupport; // сумма поддержки

    public Sponsor(String name, int amountOfSupport) {
        this.name = name;
        this.amountOfSupport = amountOfSupport;
    }

    public void sponsorTheRace(){
        System.out.println("Спонсирует заезд " + name+ ", на сумму: "+ amountOfSupport);
    }

    public String getName() {
        return name;
    }

    public int getAmountOfSupport() {
        return amountOfSupport;
    }

    @Override
    public String toString() {
        return "Спонсор " + name + " сумма поддержки "+ amountOfSupport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor<?> sponsor = (Sponsor<?>) o;
        return amountOfSupport == sponsor.amountOfSupport && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amountOfSupport);
    }
}
