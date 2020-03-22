package com.jasoyang.session1;
import java.time.LocalDate;

public class Employee
{
    public static void main(String[] Args)
    {
        System.out.println("add unit test here");
    }
    public Employee(String name, double salary, LocalDate date)
    {
        name_ = name;
        salary_ = salary;
        hireDate_ = LocalDate.of(date.getYear(),
            date.getMonthValue(),
            date.getDayOfMonth());
    }

    public String getName()
    {
        return name_;
    }

    public double getSalary()
    {
        return salary_;
    }

    public LocalDate getHireday()
    {
        return hireDate_;
    }

    public void raiseSalary(double byPercent)
    {
        salary_ = salary_ * (1 + byPercent / 100);
    }

    @Override
    public String toString()
    {
        String info = name_ + " join company at " + hireDate_.toString()+" and owm salary " + salary_;
        return info;
    }
    private String name_;
    private double salary_;
    private LocalDate hireDate_;
}