package DesignPattern.Factory;

public class EmployeeFactory {
    public static Employee getEmployee(EmployeeType employeeType){
        switch (employeeType){
            case Web:
                return new WebDeveloper();
            case Android:
                return new AndroidDeveloper();
            default:
                return null;
        }
    }
}
