package com.blp.employee_wage_problem;

public class EmployeeWageProblem
{
    public static final int EMP_FULL_TIME_HOUR = 1;
    public static final int EMP_PART_TIME_HOUR = 2;
    public static final int EMP_WAGE_PER_HOUR = 20;
    public static final int NUM_WORKING_DAY_MONTH = 20;
    public static final int EMP_MONTHLY_WORKING_HOUR = 100;

    public static void main(String[] args)
    {
        int empHours;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        while (totalEmpHrs <= EMP_MONTHLY_WORKING_HOUR && totalWorkingDays < NUM_WORKING_DAY_MONTH)
        {
            totalWorkingDays++;
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            switch (empCheck)
            {
                case EMP_FULL_TIME_HOUR -> {
                            empHours = 8;
                            System.out.println("Employee is present for full time");
                }
                case EMP_PART_TIME_HOUR -> {
                            empHours = 4;
                            System.out.println("Employee is present for half time");
                }
                default ->
                        {
                            empHours = 0;
                            System.out.println("Employee is absent");
                        }
            }
            totalEmpHrs += empHours;
            System.out.println("Day:" + totalWorkingDays + "Emp Hr:" + empHours);
        }
        int totalEmpWage = totalEmpHrs * EMP_WAGE_PER_HOUR;
        System.out.println("Total Emp Wage = " + totalEmpWage);
    }
}