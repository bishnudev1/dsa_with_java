import java.util.LinkedList;

public class Queue{

     public static void main(String []args){


        // Declaring Queue with LinkedList
        LinkedList<String> _queue = new LinkedList<String>();


        // Enqueue values with offer() method
        _queue.offer("Bishnudev");
        _queue.offer("Excel");
        _queue.offer("Khutia");

        // Printing queue values
        System.out.println(_queue);

        // Printing the head / top most item in Queue
        System.out.println(_queue.peek());

        // Dequeue values with poll() method
        _queue.poll();
        _queue.poll();
        _queue.poll();
        _queue.poll();

        // Checking the queue size and empty or not
        System.out.println(_queue.isEmpty()); // -> false
        System.out.println(_queue.size()); // -> 3

        //Checking if an object is in the queue or not

        boolean isHere = _queue.contains("Excel");
        System.out.println(isHere); // -> false

     }
}

/*
    What's Queue:
        1. It's a FIFO and Linear Data Structure
        2. Head -> the first / top most element
        3. Tail -> the last / bottom most element
        4. Enqueue/offer() -> push new items in queue
        5. Dequeue/poll() -> pop items in queue

*/