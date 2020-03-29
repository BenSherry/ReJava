import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import com.jasoyang.session1.*;
import com.jasoyang.session0.*;
import com.jasoyang.session2.*;
import com.jasoyang.session3.*;
import com.jasoyang.session4.*;

class Client {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        LocalDate today = LocalDate.now();
        LocalDate seasonAgo = today.minusDays(90);
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("jason", 500, seasonAgo));
        staff.add(new Employee("Tom", 900, today));
        staff.add(new Manager("Jimmy", 900, today, 2000));
        staff.get(0).raiseSalary(80);
        Comparator<Employee> com = (Employee x, Employee y) -> { 
            // in lambda java, you really don't need think how to
            // capture a variable like c++ [](){};just use it;
            // you can use 'm' here but can't change it here.
            return x.getName().compareToIgnoreCase(y.getName());
        };
        // in c++ way, just like
        // std::sort(array.begin(), array.end(),[](){});
        staff.sort(com);
        FileWriter fileName = new FileWriter("employee.dat", true);
        PrintWriter out = new PrintWriter(fileName);
        WriteData(staff, out);
        BufferedReader bd = new BufferedReader(new FileReader("employee.dat"));
        ReadData(bd);
        bd.close();
        CalendarTest.Show();
        ReflectionTest ref = new ReflectionTest("com.jasoyang.session1.Employee");
        ref.ShowCLassINfo();
        MyListener listener = new ListenerA();
        MyMonitor monitor = new MyMonitor();
        monitor.registerListener(listener);
        monitor.handle();
    }

    public static void WriteData(ArrayList<Employee> staff, PrintWriter out)
    {
        for(Employee e : staff)
        {
            out.println(e.toString());
            System.out.println(e.getClass().getName());
        }
        out.flush();
    }

    public static void ReadData(BufferedReader bd) throws FileNotFoundException,IOException
    {
        String sentence = "";
        while((sentence = bd.readLine()) != null)
        {
            System.out.println(sentence);
        }
    }
}
