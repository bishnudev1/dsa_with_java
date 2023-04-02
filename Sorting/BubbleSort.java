public class BubbleSort{
    public static void main(String[] args){

        int[] arr = {9,2,6,1,4};
        sort(arr);
        printArray(arr);

    }
    static void sort(int[] A){
           for(int i=0;i<(A.length-1);i++){
            for(int j=0;j<(A.length - i -1);j++){
                if(A[j] > A[j+1]){
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
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