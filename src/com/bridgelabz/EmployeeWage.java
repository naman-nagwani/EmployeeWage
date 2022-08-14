package com.bridgelabz;

public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to EmployeeWage computation");
        int empPresent = (int) Math.floor(Math.random()* 10)%2;  // 0 and 1 // 0.87 // 8.7
        System.out.println(empPresent);
        if(empPresent == 1){
            System.out.println("Employee Present");
        }
        else {
            System.out.println("Employee Absent");
        }
    }
}
