package com.mycompany.question3;

import java.util.*;

public class Employee {

    private String employeeCode;
    private String employeeName;
    private int yearOfService;
    private double salaryCoef;
    private int basicSalary;
    private double salary;
    public double getSalary(){
        return salaryCoef*basicSalary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getYearOfService() {
        return yearOfService;
    }

    public double getSalaryCoef() {
        return salaryCoef;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public Employee() {
    }

    public Employee(String employeeCode, String employeeName, int yearOfService, double salaryCoef, int basicSalary) {
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.yearOfService = yearOfService;
        this.salaryCoef = salaryCoef;
        this.basicSalary = basicSalary;
        
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee code :");
        employeeCode = sc.next();
        System.out.println("Enter employee name :");
        employeeName = sc.next();
        System.out.println("Enter year of service :");
        yearOfService = sc.nextInt();
        System.out.println("Enter salary coefficient :");
        salaryCoef = sc.nextDouble();
        System.out.println("Enter basic salary :");
        basicSalary = sc.nextInt();       
        salary = salaryCoef*basicSalary;
    }

    public void Output() {
        System.out.println("employee code :"+employeeCode+" |employee Name :"+employeeName+" |year Of Service :"+yearOfService+" |salary :"+salary);
    }
    

}
