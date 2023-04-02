/*
    What's P queue:
        1. It's a FIFO data structure
        2. Here we set some priority order unlike normal queues
        3. It sorts the int and double values automatically

*/
import java.util.*;

public class PriorQueue{
    public static void main(String[] args){
        //Queue<Double> _queue = new PriorityQueue<>();
        Queue<Double> _queue = new PriorityQueue<>(Collections.reverseOrder()); // Will reverse the output order
        
        _queue.offer(3.0);
        _queue.offer(2.5);
        _queue.offer(4.0);
        _queue.offer(1.5);
        _queue.offer(2.0);

        while(!_queue.isEmpty()){
            System.out.println(_queue.poll());
        }

        // Here the output will come sortedly 1.5 -> 2.0 -> 2.5 -> 3.0 -> 4.0
    }
}