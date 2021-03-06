package com.models;

import com.services.SalaryService;

public class Salary {

    private int valueBYN;
    private double valueInUSD;

    public Salary(int valueBYN) {
        this.valueBYN = valueBYN;
        valueInUSD = valueBYN / getDollarRate();
        SalaryService.addSalary(this);
    }

    private double getDollarRate() {
        return SalaryService.getDollarRate();
    }

    public double getValueInUSD() {
        return valueInUSD;
    }

    public int getValueInBYN() {
        return valueBYN;
    }

    public void setSalary(int value) {
        this.valueBYN = value;
    }

}
