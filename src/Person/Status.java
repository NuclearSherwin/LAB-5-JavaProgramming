package Person;

public class Status {
    private String status;

    public Status() {
        status = "Freshman";
    }

    public Status(String status) {
        if (status.equalsIgnoreCase("Freshman") ||
                status.equalsIgnoreCase("Sophomore") ||
                status.equalsIgnoreCase("Junior") ||
                status.equalsIgnoreCase("Senior")) {
            this.status = status;
        } else throw new IllegalStateException("Status must be: Freshman, Sophomore, Junior or Senior!");
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = status;
    }
}
