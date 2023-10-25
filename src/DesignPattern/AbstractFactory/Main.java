package DesignPattern.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = EmployeeFactory.getEmployee(new AndroidFactory());
        System.out.println(employee1.salary());

        Employee employee2 = EmployeeFactory.getEmployee(new WebFactory());
        System.out.println(employee2.salary());
    }
}
