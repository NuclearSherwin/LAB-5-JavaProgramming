package Person;

public class Person {
    private String name;
    private String address;
    private String phoneNum;
    private String email;


    // assign value to constructor
    public Person(String name, String address, String phoneNum, String email) {
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress() {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum() {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = email;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNum + '\'' +
                ", emailAddress='" + email + '\'';
    }
}

