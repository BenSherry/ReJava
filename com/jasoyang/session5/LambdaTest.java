import java.util.Arrays;
import java.util.Comparator;

public class LambdaTest
{
    public static void main(String[] args)
    {
        String [] planets ={"Mars","Erath"};
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));

        int m =8;

        Comparator<String> com = (x, y) -> { 
            // in lambda java, you really don't need think how to
            // capture a variable like c++ [](){};just use it;
            // you can use 'm' here but can't change it here.
            System.out.println(m);
            return x.length() - y.length();
        };
        
        /***********8
        Arrays.sort(planets,(first,second) ->
        {
            return first.length() - second.length();
        });
        *******************/
        Arrays.sort(planets,com);
        System.out.println(Arrays.toString(planets));
    }
}