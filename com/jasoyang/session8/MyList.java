// package com.jasoyang.session8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MyList {

public static void main(String[] args)
{
    List<String> staff = new ArrayList<String>();
    staff.add("first");
    staff.add("second");
    staff.add("third");
    staff.add("fourth");
    staff.add("5th");
    Iterator<String> iter = staff.iterator();
    while(iter.hasNext())
    {
        
        String temp = "first";

        if (iter.next().compareTo(temp) == 0)
        {
            iter.remove();
        }
    }
    // iter just like a "cursor", that means it will between 2 element.
    // call it.next();it.remove(); the left elem will be deleted
    // notice that, call it.pervious(); it.remove();the right one will be deleted.
    System.out.println("--------------------------------------------");
    ListIterator<String> aIter = staff.listIterator();
   
    List<String> b = new LinkedList<>();
    b.add("e");
    b.add("f");
    b.add("g");
    b.add("h");
    
    Iterator <String> bIter = b.iterator();
    while(bIter.hasNext())
    {
        if (aIter.hasNext())
        {
            aIter.next();
        }
        aIter.add(bIter.next());
    }

    System.out.println(staff);

    // remove every second word
    bIter = b.iterator();
    while(bIter.hasNext())
    {
        bIter.next();
        if(bIter.hasNext())
        {
            System.out.println(bIter.next());
            bIter.remove();
        }
    }
    System.out.println(b.size());
    System.out.println(b);
    // third_it.forEachRemaining(String->System.out.println(String));

    
}
}
