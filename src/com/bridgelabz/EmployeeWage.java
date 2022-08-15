package com.bridgelabz;

public class EmployeeWage {


    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage computation");
        Company company = new Company();
        company.calculate();
    }


}

class Company{
    public static final int WAGE_PER_HOUR = 20;

    public static final int WORKING_DAYS_PER_MONTH = 20;

    public static final int TOTAL_WORKING_HOURS = 100;

    public static int dailyEmployeeWage = 0;

    public static int daysCount = 0;

    public static int totalWagesPerMonth = 0;

    public static int totalHours = 0;

    public static final int FULL_DAY_HOUR = 10;

    public static final int HALF_DAY_HOUR = 5;

    public static final int IS_PART_TIME = 1;

    public static final int IS_FULL_TIME = 2;

    public void calculate(){
        while (daysCount < WORKING_DAYS_PER_MONTH  &&  totalHours <= TOTAL_WORKING_HOURS) {
            int empPresent = (int) (Math.random() * 10) % 3;
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