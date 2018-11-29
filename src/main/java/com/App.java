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
import org.springframework.stereotype.Component;

@Component
public class App {

    @Autowired
    PositionService positionService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    SalaryService salaryService;


    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        App app = ctx.getBean(App.class);
        app.run();

        System.out.println(app.salaryService);

        Lifecycle lifecycle = new Lifecycle();
        lifecycle.addObserver(app.salaryService);
        lifecycle.startLifecycle();
    }

    public void run() {
        Employee wowa = new Employee("Wowa");
        Employee denis = new Employee("Denis");
        Employee pavlik = new Employee("Pavlik");

        positionService.addPosition(new Position("Programmer", new Salary(1000)));
        positionService.addPosition(new Position("Teacher", new Salary(300)));
        positionService.addPosition(new Position("Driver", new Salary(600)));

        employeeService.hireEmployee(wowa, positionService.getByName("Programmer"));
        employeeService.hireEmployee(pavlik, positionService.getByName("Teacher"));
        employeeService.hireEmployee(denis, positionService.getByName("Driver"));
    }
}
