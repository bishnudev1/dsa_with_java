public class SelectionSort{
    public static void main(String[] args){

        int[] arr = {9,2,6,1,4};
        sort(arr);
        printArray(arr);

    }
    static void sort(int[] A){
           for(int i=0;i<(A.length-1);i++){
            int min = i;
            for(int j=i;j<(A.length);j++){
                if(A[min] > A[j]){
                    min = j;
                }
            }
        int temp = A[i];
        A[i] = A[min];
        A[min] = temp;
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

Advantages: Good for small sets

Disadvantages: Very time consuming for big data sets

*/