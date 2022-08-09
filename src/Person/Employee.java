package Person;

import java.util.Date;

public class Employee extends Person {
    private String office;
    private double salary;
    private Date hiredDate;

    // constructor

    public Employee(String name, String address, String phoneNum,
                    String email, String office, double salary, Date hiredDate) {
        super(name, address, phoneNum, email);
        this.office = office;

        this.salary = salary;
        this.hiredDate = hiredDate;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice() {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public Date getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate() {
        this.hiredDate = hiredDate;
    }

    public String toString() {
        return "office='" + office + '\'' +
                ", salary=" + salary +
                ", hiredDate=" + hiredDate + super.toString();
    }
}
