public class BinarySearch{
    public static void main(String[] args){

        int item = 6;
        int[] arr = {1,2,3,4,5,6};

        int result = search(item,arr);

        System.out.println(result+1);

    }
    static int search(int key, int[] A){

            int low = 0;
            int high = (A.length - 1);

            while(low <= high){
                int middle = low + (high-low) /2;
                int value = A[middle];

                if(value < key) low = middle + 1;
                else if(value > key) high = middle - 1;
                else return middle;
            }

            return -1;
        }
}

/*

Time Complexity: O(n)

Advantages: Good for small sets

Disadvantages: Array must be sorted