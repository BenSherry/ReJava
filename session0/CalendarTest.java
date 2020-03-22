import java.time.DayOfWeek;
import java.time.LocalDate;


public class CalendarTest
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        date = date.minusDays(day-1);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int value = dayOfWeek.getValue();
        while(date.getMonthValue() == month)
        {
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth() == day)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY)
            {
                System.out.println();
            }
            date = date.plusDays(1);
        }
        System.out.println();
    }
}
