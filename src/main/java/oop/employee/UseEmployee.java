package oop.employee;

public class UseEmployee {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee manager = new Manager();

        employee.hours = 160;
        manager.hours = 160;

        System.out.println("Employee:");
        System.out.println("-Tariff per hour: " + employee.getTariffPerHour());
        System.out.println("-Salary: " + employee.getSalary());
        System.out.println("Manager:");
        System.out.println("-Tariff per hour: " + manager.getTariffPerHour());
        System.out.println("-Salary: " + manager.getSalary());
    }

}
