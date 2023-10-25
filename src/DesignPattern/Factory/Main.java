package DesignPattern.Factory;

public class Main {
    public static void main(String[] args) {
        Employee employee = EmployeeFactory.getEmployee(EmployeeType.Android);
        System.out.println(employee.salary());
    }
}
