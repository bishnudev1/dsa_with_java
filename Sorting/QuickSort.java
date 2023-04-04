public class QuickSort{
    public static void main(String[] args){

        int[] arr = {9,2,6,1,4};
        quickSort(arr,0,arr.length-1);
        printArray(arr);

    }
    static void quickSort(int[] array, int start, int end){
        if(end <= start) return;

        int pivot = partition(array, start, end);
        quickSort(array,start,pivot-1);
        quickSort(array,pivot+1, end);

    }

    static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start - 1;

        for(int j=start;j<=end-1;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;

        return i;
    }

    static void printArray(int[] A){
        for(int item : A){
            System.out.println(item);
        }
    }
}

/*

Time Complexity: O(nlogn) 
Worst Case -> O(n^2) if already sorted array
Space Complexity -> O(log(n))

It's Divider Conquor Technique

Advantages:
    1. Faster than Bubble, Insertion and Selection sort
    2. Best case O(n) compared to Selection Sort which is O(n^2)

Disadvantages: Takes more space O(n)

*/