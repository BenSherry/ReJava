package com.jasoyang.session3;
import java.lang.reflect.Modifier;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class ReflectionTest
{
    public ReflectionTest(String className) throws ClassNotFoundException
    {
        class_ = Class.forName(className);
    }
    public void ShowCLassINfo()
    {
        ShowContruct();
        ShowFunction();
        ShowField();
    }
    private void ShowField()
    {
        Field[] fields = class_.getDeclaredFields();
        for (Field field : fields)
        {
            String modifier =Modifier.toString(field.getModifiers());
            System.out.print(modifier + " ");
            System.out.println(field.getType().getName() + " " + field.getName());
        }
    }

    private void ShowFunction()
    {
        Method[] methods = class_.getMethods();
        for(Method method : methods)
        {
            String modifier = Modifier.toString(method.getModifiers());
            System.out.print(modifier + " " + method.getReturnType().getName() + " " + method.getName() + "(");
            Class[] parameters = method.getParameterTypes();
            for (int j = 0; j < parameters.length; j++)
            {
                if (j > 0)
                {
                    System.out.print(", ");
                }
                System.out.print(parameters[j].getName());
            }
            System.out.println(")");
        }
    }

    private void ShowContruct()
    {
        Constructor[] methods = class_.getConstructors();
        for(Constructor method : methods)
        {
            String modifier = Modifier.toString(method.getModifiers());
            System.out.print(modifier + " " + method.getName() + "(");
            Class[] parameters = method.getParameterTypes();
            for (int j = 0; j < parameters.length; j++)
            {
                if (j > 0)
                {
                    System.out.print(", ");
                }
                System.out.print(parameters[j].getName());
            }
            System.out.println(")");
        }
    }

    private Class class_;
}