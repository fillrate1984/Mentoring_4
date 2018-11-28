package com.services;

import com.interfaces.Observer;
import com.models.Salary;

import java.util.HashSet;

public class SalaryService implements Observer {

    private static double dollarRate = 2.1;
    private static int inflation = 50;
    private static HashSet<Salary> salaries = new HashSet<>();
    private HashSet<Observer> observers = new HashSet<>();

    public static void setDollarRate(double newValue) {
        dollarRate = newValue;
        for (Salary salary : salaries) {
            int newBYNValue = (int) (salary.getValueInUSD() * dollarRate);
            salary.setSalary(newBYNValue);
        }
    }

    public static double getDollarRate() {
        return dollarRate;
    }

    public static void addSalary(Salary salary) {
        salaries.add(salary);
    }

    public static void printSalaries() {
        for (Salary salary : salaries) {
            System.out.println(salary.getValueInBYN());
        }
    }

    @Override
    public void handleEvent() {
        double increasedValue = (dollarRate * inflation) / 100;
        double newDollarRateValue = dollarRate + increasedValue;
        setDollarRate(newDollarRateValue);
        printSalaries();
    }
}
