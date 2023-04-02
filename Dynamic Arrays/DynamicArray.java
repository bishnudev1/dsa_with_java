import java.util.*;

public class DynamicArray {
    public static void main(String[] args) {
        Dynamic _newArr = new Dynamic(5);

        _newArr.add(10);
        _newArr.add(20);
        _newArr.add(30);
        _newArr.add(40);
        _newArr.add(50);
        _newArr.add(60);

        _newArr.delete(10);
        _newArr.delete(20);
        _newArr.delete(30);
        _newArr.delete(40);

        System.out.println("Capacity: "+_newArr.capacity);
        System.out.println("Size: "+_newArr.size);

        //System.out.println(_newArr.isEmpty());

        //_newArr.insert(1,'D');

        //System.out.println(_newArr);

        //_newArr.delete(20);

        //System.out.println(_newArr);

        //System.out.println(_newArr.search(60));

    }
}



class Dynamic{
    int size;
    int capacity = 10;
    Object[] arr;

    public Dynamic(){
        this.arr = new Object[capacity];
    }

    public Dynamic(int capacity){
        this.capacity = capacity;
        this.arr = new Object[capacity];
    }

    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        arr[size] = data;
        size++;
    }

    public void insert(int index,Object data){
        if(size >= capacity){
            grow();
        }

        for(int i=size;i > index;i--){
            arr[index] = arr[index-1];
        }

        arr[index] = data;
        size++;
    }

    public void delete(Object data){
        for(int i=0;i<size;i++){
            if(arr[i] == data){
                for(int j=0;j<(size - i - 1);j++){
                    arr[i+j] = arr[i+j+1];
                }
                arr[size - 1] = null;
                size--;
                if(size <= (int)(capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }

    public void grow(){
        int newCapacity = capacity * 2;
        Object[] newArr = new Object[newCapacity];

        for(int i=0;i<size;i++){
            newArr[i] = arr[i];
        }
        capacity = newCapacity;
        arr = newArr;
    }

    public void shrink(){
        int newCapacity = capacity / 2;
        Object[] newArr = new Object[newCapacity];

        for(int i=0;i<size;i++){
            newArr[i] = arr[i];
        }
        capacity = newCapacity;
        arr = newArr;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int search(Object data){

        for(int i=0;i<size;i++){
            if(arr[i] == data){
                return i;
            }
        }

        return -1;
    }

    public String toString(){
        String str = "";

        for(int i=0;i<size;i++){
            str += arr[i] + " ";
        }

        if(size == 0){
            return "[]";
        }
        return str;
    }


}

/*

    Advantages:
        1. Random access of elements O(1)
        2. Good locality of reference and data cache utilization
        3. Easy to insert/delete at the end

    Disadvantages:
        1. Wastes more memory
        2. Shifting elements is time consuming O(n)
        3. Expanding/Shrinking the array is time consuming O(n)

*/