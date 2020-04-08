import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String [] args)
    {
        Set<String> words = new HashSet<>();
        words.add("121");
        words.add("161");
        words.add("131");
        System.out.println(words); // [121, 161, 131]

        Set<String> treeWords = new TreeSet<>();
        treeWords.add("121");
        treeWords.add("161");
        treeWords.add("131");
        System.out.println(treeWords); // [121, 131, 161]

    }
}