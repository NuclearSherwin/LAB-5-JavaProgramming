package Store;

public class Store {
    private String name;
    private double SALESJAXJATE = 0.06;

    public Store() {
    }

    public Store(String newName) {
        setName(newName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
