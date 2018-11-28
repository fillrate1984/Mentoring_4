package com;

import com.models.Employee;
import com.models.Position;
import com.models.Salary;
import com.services.EmployeeService;
import com.services.PositionService;
import com.services.SalaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("employees.xml");
        Employee wowa = ctx.getBean("wowa", Employee.class);
        Employee denis = ctx.getBean("denis", Employee.class);
        Employee pavlik = ctx.getBean("pavlik", Employee.class);

        PositionService positionService = ctx.getBean("positionService", PositionService.class);
        positionService.addPosition(new Position("Programmer", new Salary(1000)));
        positionService.addPosition(new Position("Teacher", new Salary(300)));
        positionService.addPosition(new Position("Driver", new Salary(600)));


        EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
        employeeService.hireEmployee(wowa, positionService.getByName("Programmer"));
        employeeService.hireEmployee(pavlik, positionService.getByName("Teacher"));
        employeeService.hireEmployee(denis, positionService.getByName("Driver"));

        SalaryService salaryService = ctx.getBean("salaryService", SalaryService.class);
        Lifecycle lifecycle = new Lifecycle();
        lifecycle.addObserver(salaryService);
        lifecycle.startLifecycle();
    }
}
