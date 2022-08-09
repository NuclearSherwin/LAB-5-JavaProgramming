package Person;

import java.util.Date;

public class Staff extends Person {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress,
                 String office, double salary, Date hiredDate, String title) {
        super(name, address, phoneNumber, emailAddress);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' + super.toString();
    }
}
