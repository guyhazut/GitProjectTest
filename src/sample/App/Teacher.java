package sample.App;

import java.util.List;

public class Teacher extends Person{

    private double salary;

    public Teacher(String firstName, String lastName, String email, String phoneNumber, String address, double salary) {
        super(firstName, lastName, email, phoneNumber, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher name: " + super.getFirstName() + " " + super.getLastName() + ", email: " + super.getEmail() + ", address: " + super.getAddress() + ", phone: " + super.getPhoneNumber()
                + ", salary= " + salary +"." ;
    }
}
