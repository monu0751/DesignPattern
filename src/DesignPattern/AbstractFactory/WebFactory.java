package DesignPattern.AbstractFactory;

public class WebFactory extends EmployeeAbstractFactory{
    @Override
    public Employee getEmployee() {
        return new WebEmployee();
    }
}
