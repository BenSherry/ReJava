package com.jasoyang.session7;

import java.io.Serializable;

public class Pair<T extends Comparable & Serializable> 
{
    private T first_;
    private T second_;

    public Pair(T first, T second)
    {
        first_ = first;
        second_ = second;
    }

    public T getFirst()
    {
        return first_;
    }

    public T getSecond()
    {
        return second_;
    }

    @Override
    public String toString()
    {
        String info = "First is "+ getFirst() + " and  Second is " + getSecond();
        return info;
    }
}
