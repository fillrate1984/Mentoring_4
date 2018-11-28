package com.services;

import com.models.Employee;
import com.models.Position;
import com.models.Salary;
import org.springframework.stereotype.Component;

import java.util.HashSet;

@Component
public class EmployeeService {

    private static HashSet<Employee> employees = new HashSet<>();

    public void hireEmployee(Employee employee, Position position) {
        employee.setPosition(position);
        employees.add(employee);
    }

    public void fireEmployee(Employee employee) {
        employee.setPosition(null);
        employees.remove(employee);
    }

    public static void printAllEmployees() {
        for (Employee employee : employees) {
            String employeeName = employee.getName();
            String employeePosition = employee.getPosition().toString();
            String employeeSalary = employee.getPosition().getSalary().toString();
            System.out.printf("Employee: %s, has %s, with %s BYN\n", employeeName,
                    employeePosition, employeeSalary);
        }
    }
}
