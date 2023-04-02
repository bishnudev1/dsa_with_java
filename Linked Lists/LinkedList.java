import java.util.*;

public class LinkedList{
    public static void main(String[] args){

        LinkedList<String> _linkedList = new LinkedList();

        // Pushing new objects into linked list
        _linkedList.offer("Hello");
        _linkedList.offer("Hii");
        _linkedList.offer("Greet");

        System.out.println(_linkedList);

        // Popping objects from linked list
        _linkedList.pop();

        // Adding new head item
        _linkedList.addFirst("A");

        // Adding new tail item
        _linkedList.addLast("Z");

        System.out.println(_linkedList);

        // Adding an item in an index
        _linkedList.add(4,"D");

        // Remove an item in an index
        _linkedList.remove("G");

        System.out.println(_linkedList);

        // Showing the first item in linked list
         System.out.println(_linkedList.peekFirst());

        // Showing the last item in linked list
        System.out.println(_linkedList.peekLast());

        System.out.println(_linkedList);
    }
}

/*
    What's Linked List and it's advantages ?
        1. It's a dynamic data structure which contains two parts -> data + address
        2. Each eliments are linked using pointers
        3. Insertions and Deletion of Nodes is easy -> O(1)
        4. No/Low memory wastage

    Disadvantages:
        1. Greater memory usage
        2. No random access of elements
        3. Accessing/searching elements is more time consuming

    Uses:
        1. Implement Stacks/Queues
        2. GPS Navigation
        3. Music Playlist
*/