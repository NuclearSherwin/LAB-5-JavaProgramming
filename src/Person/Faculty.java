package Person;

import java.util.Date;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNum, String email,
                   String office, double salary, Date hiredDate, String officeHours, String rank) {
        super(name, address, phoneNum, email, office, salary, hiredDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours() {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank() {
        this.rank = rank;
    }
}




