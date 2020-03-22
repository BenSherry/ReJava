import java.time.LocalDate;
import com.jasoyang.session1.*;
import com.jasoyang.session0.*;

class Client
{
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        LocalDate seasonAgo = today.minusDays(90);
        Employee [] staff = new Employee[2];
        staff[0] = new Employee("jason", 500, seasonAgo);
        staff[1] = new Employee("Tom", 900, today);
        staff[0].raiseSalary(80);
        for(Employee e : staff)
        {
            e.showEmployee();
        }

        CalendarTest.Show();
    }
}