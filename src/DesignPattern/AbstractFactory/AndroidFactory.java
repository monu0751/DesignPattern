package DesignPattern.AbstractFactory;

public class AndroidFactory extends EmployeeAbstractFactory{
    @Override
    public Employee getEmployee() {
        return new AndroidEmployee();
    }
}
