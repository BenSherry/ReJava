import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.time.LocalDate;
import java.util.ArrayList;

import com.jasoyang.session1.*;
import com.jasoyang.session0.*;
import com.jasoyang.session2.*;

class Client {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        LocalDate today = LocalDate.now();
        LocalDate seasonAgo = today.minusDays(90);
        ArrayList<Employee> staff = new ArrayList<>();
        staff.add(new Employee("jason", 500, seasonAgo));
        staff.add(new Employee("Tom", 900, today));
        staff.add(new Manager("Jimmy", 900, today, 2000));
        staff.get(0).raiseSalary(80);
        FileWriter fileName = new FileWriter("employee.dat", true);
        PrintWriter out = new PrintWriter(fileName);
        WriteData(staff, out);
        BufferedReader bd = new BufferedReader(new FileReader("employee.dat"));
        ReadData(bd);
        bd.close();
        CalendarTest.Show();
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
