package com.jasoyang.session4;

public class MyMonitor
{
    private MyListener listener_;
    public void registerListener(MyListener listener)
    {
        listener_ = listener;
    }

    public void handle()
    {
        listener_.handle();
    }
}
