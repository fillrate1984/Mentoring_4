package com;

import com.models.Employee;
import com.models.Position;
import com.models.Salary;
import com.services.EmployeeService;
import com.services.PositionService;
import com.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    @Autowired
    static Employee wowa;
    @Autowired
    static Employee denis;
    @Autowired
    static Employee pavlik;
    @Autowired
    static PositionService positionService;
    @Autowired
    static EmployeeService employeeService;
    @Autowired
    SalaryService salaryService;

    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext("employees.xml");

        positionService.addPosition(new Position("Programmer", new Salary(1000)));
        positionService.addPosition(new Position("Teacher", new Salary(300)));
        positionService.addPosition(new Position("Driver", new Salary(600)));

        employeeService.hireEmployee(wowa, positionService.getByName("Programmer"));
        employeeService.hireEmployee(pavlik, positionService.getByName("Teacher"));
        employeeService.hireEmployee(denis, positionService.getByName("Driver"));

        /*SalaryService ss = salaryService;

        Lifecycle lifecycle = new Lifecycle();
        lifecycle.addObserver();
        lifecycle.startLifecycle();*/
    }
}
