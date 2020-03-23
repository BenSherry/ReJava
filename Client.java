import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.time.LocalDate;
import com.jasoyang.session1.*;
import com.jasoyang.session0.*;
import com.jasoyang.session2.*;

class Client {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        LocalDate today = LocalDate.now();
        LocalDate seasonAgo = today.minusDays(90);
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("jason", 500, seasonAgo);
        staff[1] = new Employee("Tom", 900, today);
        staff[2] = new Manager("Jimmy", 900, today, 2000);
        staff[0].raiseSalary(80);
        FileWriter fileName = new FileWriter("employee.dat", true);
        PrintWriter out = new PrintWriter(fileName);
        WriteData(staff, out);
        BufferedReader bd = new BufferedReader(new FileReader("employee.dat"));
        ReadData(bd);
        bd.close();
        CalendarTest.Show();
    }

    public static void WriteData(Employee[] staff, PrintWriter out)
    {
        for(Employee e : staff)
        {
            out.println(e.toString());
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