import java.util.*;

public class Problem{
    public static void main(String[] args){
        Hashtable<Integer,String> _table = new Hashtable(10);

        _table.put(100,"Bishnudev");
        _table.put(121,"Arnab");
        _table.put(323,"Sudip");
        _table.put(498,"Khutia");
        _table.put(212,"Metya");

        for(Integer key : _table.keySet()){
            System.out.println("Hash Index: " + key.hashCode() % 10 +" "+"Key: "+key+" "+"Value: "+_table.get(key));
        }
    }
}


/*
Hashtable:
    1. A data structure that stores unique key and value pairs. eg. <Integer,String>
    2. Each key/value pair is known as an Entry
    3. Fast insertion, look up, deletion of key/value pairs
    4. Not ideal for small data sets, great with large data sets

    Hasing:
        1. Takes a key and computes an integer
        2. We use (hash % capacity of table) to calculate the hash index value
        3. key.hashCode() % capacity = index

    Bucket:
        1. An indexed storage location for one or more entries
        2. Can store multiple entries in case of a collision (linked similarly like a linked list)

    Collision:
        1. Hash function generetes the same index for more than one key
        2. Less collisions = more efficiency

    Runtime Complexity:
        1. Best Case -> O(1)
        2. Worst Case -> O(n)

*/