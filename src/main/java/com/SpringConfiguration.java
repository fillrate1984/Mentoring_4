package com;

import com.models.Employee;
import com.services.EmployeeService;
import com.services.PositionService;
import com.services.SalaryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com")
@Configuration
public class SpringConfiguration {

}
