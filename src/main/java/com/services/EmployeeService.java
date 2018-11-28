package com.services;

import com.models.Employee;
import com.models.Position;

public class EmployeeService {

    public void hireEmployee(Employee employee, Position position) {
        employee.setPosition(position);
    }

    public void fireEmployee(Employee employee) {
        employee.setPosition(null);
    }
}
