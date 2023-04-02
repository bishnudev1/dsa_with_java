public class LinearSearch{
    public static void main(String[] args){

        int item = 4;
        int[] arr = {1,2,3,4,5,6};

        int result = search(item,arr);

        System.out.println(result+1);

    }
    static int search(int key, int[] A){
            for(int i=0;i<A.length;i++){
                if(A[i] == key){
                    return i;
                }
            }
            return -1;
        }
}

/*

Runtime Complexity: O(n)

Disadvantages: Slow for big data sets

Advantages:
    1. Fast for small data sets
    2. Does not need to sorted
    3. useful for linked lists that dont have random accesss to its elements