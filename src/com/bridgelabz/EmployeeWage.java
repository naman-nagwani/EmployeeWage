package com.bridgelabz;

public class EmployeeWage {

    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 10;

    private static final int HALF_DAY_HOUR = 5;

    private static final int IS_PART_TIME = 1;

    private static final int IS_FULL_TIME = 2;
    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage computation");
        Employee employee1 = new Employee();

        while (employee1.daysCount < employee1.WORKING_DAYS_PER_MONTH  &&  employee1.totalHours <= employee1.TOTAL_WORKING_HOURS) {
            int empPresent = (int) (Math.random() * 10) % 3;  // between 0 and 1 // 0.87 // 8.7 // 8.0 // 3.0
            System.out.println("Total Hours:"+employee1.totalHours);
            switch (empPresent) {
                case IS_FULL_TIME:
                    employee1.dailyEmployeeWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    employee1.totalHours += FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    employee1.dailyEmployeeWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
                    employee1.totalHours += HALF_DAY_HOUR;
                    break;
                default:
                    employee1.dailyEmployeeWage = 0;
            }
            System.out.println("Employee wage for Day #" + (employee1.daysCount+1) + " is " + employee1.dailyEmployeeWage);

            employee1.totalWagesPerMonth += employee1.dailyEmployeeWage;
            employee1.daysCount++;
        }

        System.out.println("Total Employee Wage for a month:" + employee1.totalWagesPerMonth);
    }


}

class Employee{
    public static int dailyEmployeeWage = 0;
    public static int daysCount = 0;
    public static int totalWagesPerMonth = 0;
    public static int totalHours = 0;

    public static final int WORKING_DAYS_PER_MONTH = 20;

    public static final int TOTAL_WORKING_HOURS = 100;
}