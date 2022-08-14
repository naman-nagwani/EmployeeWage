package com.bridgelabz;

public class EmployeeWage {

    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage computation");
        int empPresent = (int) Math.floor(Math.random() * 10) % 2;
        System.out.println(empPresent);
        if (empPresent == 1) {
            System.out.println("Employee Present");
            int dailyEmployeeWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Daily Employee Wage:"+dailyEmployeeWage);

        } else {
            System.out.println("Employee Absent");
        }
    }
}
