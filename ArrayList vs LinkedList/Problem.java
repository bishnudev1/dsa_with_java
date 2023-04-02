import java.util.*;

public class Problem{
    public static void main(String[] args){
        ArrayList<Integer> _array = new ArrayList<Integer>();
        LinkedList<Integer> _linked = new LinkedList<Integer>();

        long startTime;
        long endTime;
        long timeTaken;

        for(int i=0;i<1000000;i++){
            _array.add(i);
            _linked.add(i);
        }

        startTime = System.nanoTime();
        endTime = System.nanoTime();
        timeTaken = endTime - startTime;

        // Array Operations

        //_array.get(500000);
        //_array.remove(999999);
        //System.out.println("Array task has taken: "+timeTaken+"ns"); // -> 500ns


        // Linked Operations

        //_linked.get(500000);
        _linked.remove(999999);

        System.out.println("Linked list task has taken: "+timeTaken+"ns"); // -> 600ns
    }
}

// Arrays are more faster than Linked Lists in terms of traversing elements, accessing elements as it has unique indexes