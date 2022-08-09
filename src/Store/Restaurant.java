package Store;

public class Restaurant extends Store {
    private int personPerYear;
    private double averagePricePerson;

    public Restaurant(String newName, int personPerYear, double averagePricePerson) {
        super(newName);
        this.personPerYear = personPerYear;
        this.averagePricePerson = averagePricePerson;
    }

    public int getPersonPerYear() {
        return personPerYear;
    }

    public void setPersonPerYear(int personPerYear) {
        this.personPerYear = personPerYear;
    }

    public double getAveragePricePerson() {
        return averagePricePerson;
    }

    public void setAveragePricePerson(double averagePricePerson) {
        this.averagePricePerson = averagePricePerson;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "personPerYear=" + personPerYear +
                ", averagePricePerson=" + averagePricePerson +
                '}';
    }
}
