public class InsertionSort{
    public static void main(String[] args){

        int[] arr = {9,2,6,1,4};
        sort(arr);
        printArray(arr);

    }
    static void sort(int[] A){
           for(int i=1;i<(A.length);i++){
                int temp = A[i];
                int j = i -1 ;
                while(j>=0 && A[j] > temp){
                    A[j+1] = A[j];
                    j--;
                }
                A[j+1] = temp;
            }
    }

    static void printArray(int[] A){
        for(int item : A){
            System.out.println(item);
        }
    }
}

/*

Time Complexity: O(n^2)

Advantages:
    1. Lesser steps than Bubble Sort
    2. Best case O(n) compared to Selection Sort which is O(n^2)

Disadvantages: Very time consuming for big data sets

*/