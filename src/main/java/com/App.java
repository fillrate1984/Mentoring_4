package com;

import com.models.Employee;
import com.models.Position;
import com.models.Salary;
import com.services.EmployeeService;
import com.services.PositionService;
import com.services.SalaryService;

public class App {
    public static void main(String[] args) {
        Employee denis = new Employee("Denis");
        Employee wowa = new Employee("Wowa");
        Employee pavlik = new Employee("Pavlik");

        PositionService positionService = new PositionService();
        positionService.addPosition(new Position("Programmer", new Salary(1000)));
        positionService.addPosition(new Position("Teacher", new Salary(300)));
        positionService.addPosition(new Position("Driver", new Salary(600)));

        EmployeeService employeeService = new EmployeeService();
        employeeService.hireEmployee(wowa, positionService.getByName("Programmer"));
        employeeService.hireEmployee(pavlik, positionService.getByName("Teacher"));
        employeeService.hireEmployee(denis, positionService.getByName("Driver"));

        SalaryService salaryService = new SalaryService();
        Lifecycle lifecycle = new Lifecycle();
        lifecycle.addObserver(salaryService);
        lifecycle.startLifecycle();
    }
}
