package sample.App;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

public class Student extends Person {
    private double average = 0;

    public Student(String firstName, String lastName, String email, String phoneNumber, String address, double average) {
        super(firstName, lastName, email, phoneNumber, address);
        this.average = average;
    }

    public void setAverage(Float average) {
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public String toString() {
        return "Student name: " + super.getFirstName() + " " + super.getLastName() + ", email: " + super.getEmail() + ", address: " + super.getAddress() + ", phone: " + super.getPhoneNumber()
                + ", average= " + average +"." ;
    }
}
