package oop.employee;

public class Employee {

    private final double tariffPerHour = 5.5;

    public int hours;

    public double getTariffPerHour() {
        return tariffPerHour;
    }

    public double getSalary() {
        return tariffPerHour * hours;
    }
}
