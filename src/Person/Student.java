package Person;

public class Student extends Person {
    private final Status myStatus;

//    public Student() {
//        this.myStatus = new Status();
//    }

    public Student(String name, String address, String phoneNum, String email, Status myStatus) {
        super(name, address, phoneNum, email);
        this.myStatus = myStatus;
    }

    @Override
    public String toString() {
        return "My status: " + myStatus + super.toString();
    }
}
