package com.jasoyang.session3;
import java.lang.reflect.Field;

public class ReflectionTest
{
    public ReflectionTest(String className) throws ClassNotFoundException
    {
        class_ = Class.forName(className);
    }
    public void ShowCLassINfo()
    {
        ShowField();
    }
    private void ShowField()
    {
        Field[] fields = class_.getDeclaredFields();
        System.out.println(fields.length);
        for (Field f : fields)
        {
            System.out.println(f.getType().getName() + " " + f.getName());
        }
    }
    private Class class_;
}