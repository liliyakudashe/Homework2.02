import com.sun.jdi.connect.Transport;

import java.util.Objects;

public abstract class Driver<A> {

    private boolean petrol = true;//бензин
    private String infoNot = "Информация не указана";
    private String surname;//фамилия
    private String name;//имя
    private String patronymic;//отчество
    private boolean thePresenceOfADriversLicense = true;//наличие водительских прав
    private double experience; //стаж

    public Driver(String surname, String name, String patronymic, boolean thePresenceOfADriversLicense, double experience) {
        this.surname = defaultValidDriver(surname, infoNot);
        this.name = defaultValidDriver(name, infoNot);
        this.patronymic = defaultValidDriver(patronymic, infoNot);
        this.thePresenceOfADriversLicense = thePresenceOfADriversLicense;
        this.experience = experience >= 0 ? experience:0;
    }

    public String defaultValidDriver (String valid, String defaul){
        if (valid == null || valid.isBlank()){
            return defaul;
        } else {
            return valid;
        }
    }

    public abstract void startMovingDriver(); // начать движение

    public abstract void finishTheMovementDriver (); // закончить движение

    public abstract void refillDriver();// заправка


    public boolean isPetrol() {
        return petrol;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = defaultValidDriver(surname,infoNot);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = defaultValidDriver(name,infoNot);
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = defaultValidDriver(patronymic, infoNot);
    }

    public boolean isThePresenceOfADriversLicense() {
        return thePresenceOfADriversLicense;
    }

    public void setThePresenceOfADriversLicense(boolean thePresenceOfADriversLicense) {
       if((!thePresenceOfADriversLicense)){
           this.thePresenceOfADriversLicense = false;
        }
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience >= 0 ? experience:0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return petrol == driver.petrol && thePresenceOfADriversLicense == driver.thePresenceOfADriversLicense && Double.compare(driver.experience, experience) == 0 && Objects.equals(infoNot, driver.infoNot) && Objects.equals(surname, driver.surname) && Objects.equals(name, driver.name) && Objects.equals(patronymic, driver.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petrol, infoNot, surname, name, patronymic, thePresenceOfADriversLicense, experience);
    }
}
