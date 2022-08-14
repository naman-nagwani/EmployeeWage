package com.bridgelabz;

public class EmployeeWage {

    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 10;

    private static final int HALF_DAY_HOUR = 5;

    private static final int IS_PART_TIME = 1;

    private static final int IS_FULL_TIME = 2;

    private static final int WORKING_DAYS_PER_MONTH = 20;

    private static final int TOTAL_WORKING_HOURS = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage computation");
        int dailyEmployeeWage = 0;
        int daysCount = 0;
        int totalWagesPerMonth = 0;
        int totalHours = 0;
        while (daysCount < WORKING_DAYS_PER_MONTH  &&  totalHours <= TOTAL_WORKING_HOURS) {
            int empPresent = (int) (Math.random() * 10) % 3;  // between 0 and 1 // 0.87 // 8.7 // 8.0 // 3.0
            System.out.println("Total Hours:"+totalHours);
            switch (empPresent) {
                case IS_FULL_TIME:
                    dailyEmployeeWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    totalHours += FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    dailyEmployeeWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
                    totalHours += HALF_DAY_HOUR;
                    break;
                default:
                    dailyEmployeeWage = 0;
            }
            System.out.println("Employee wage for Day #" + (daysCount+1) + " is " + dailyEmployeeWage);

            totalWagesPerMonth += dailyEmployeeWage;
            daysCount++;
        }

        System.out.println("Total Employee Wage for a month:" + totalWagesPerMonth);
    }


}