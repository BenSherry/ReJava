package com.jasoyang.session2;
import java.time.LocalDate;

import com.jasoyang.session1.*;

public class Manager extends Employee
{
    public Manager(String name, double salary, LocalDate date, double bounce)
    {
        super(name, salary, date);
        bounce_ = bounce;
    }

    // there is no need use virtual like c++ when use dynamic binding, it's
    // default in java
    @Override
    public String toString()
    {
        String info = super.toString();
        info = info + " and has bounce " + bounce_;
        return info;
    }
    
    private double bounce_;
}