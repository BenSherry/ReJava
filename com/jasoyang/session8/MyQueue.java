import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue {

    public static void main(String[] args)
    {
        Queue<String> myQueue = new ArrayDeque<>(4);
        myQueue.offer("111111");
        myQueue.offer("222222");
        myQueue.offer("333333");
        myQueue.offer("555555");
        myQueue.offer("666666");
        System.out.println(myQueue.poll()); // return the value which be removed
        System.out.println("______________________________");
        System.out.println(myQueue);
    }

}