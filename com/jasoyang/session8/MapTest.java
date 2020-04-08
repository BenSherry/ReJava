import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args)
    {
        Map<Integer,String> staff = new HashMap<>();
        staff.put(1, "Tom");
        staff.put(2, "cat");
        staff.put(3, "cindy");

        staff.forEach((k,v)->{
            System.out.println("key:" + k + " ,value:" + v);
        });

        if (staff.containsKey(3))
        {
            staff.put(3, "hello"); // return the value before update
        }

        System.out.println(staff);
    }

}