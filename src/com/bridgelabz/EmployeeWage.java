package com.bridgelabz;

public class EmployeeWage {

    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;

    private static final int HALF_DAY_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage computation");
        int empPresent = (int) Math.floor(Math.random() * 10) % 3;  // 0 and 1 // 0.87 // 8.7
        System.out.println(empPresent);
        int dailyEmployeeWage = 0;
        if (empPresent == 1) {
            System.out.println("Employee Present Full day");
            dailyEmployeeWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
        } else if (empPresent == 2) {
            System.out.println("Employee Present Half day");
            dailyEmployeeWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
        } else {
            System.out.println("Employee Absent");
        }
        System.out.println("Daily Employee Wage:" + dailyEmployeeWage);
    }
}