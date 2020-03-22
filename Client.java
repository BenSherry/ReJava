import java.time.LocalDate;
import com.jasoyang.session1.*;
import com.jasoyang.session0.*;
import com.jasoyang.session2.*;

class Client
{
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        LocalDate seasonAgo = today.minusDays(90);
        Employee [] staff = new Employee[3];
        staff[0] = new Employee("jason", 500, seasonAgo);
        staff[1] = new Employee("Tom", 900, today);
        staff[2] = new Manager("JImmy", 900, today, 2000);
        staff[0].raiseSalary(80);
        for(Employee e : staff)
        {
            System.out.println(e);
        }
        CalendarTest.Show();
    }
}