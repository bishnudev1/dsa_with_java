public class MergeSort{
    public static void main(String[] args){

        int[] arr = {9,2,6,1,4};
        mergeSort(arr);
        printArray(arr);

    }
    static void mergeSort(int[] array){
        int length = array.length;

        if(length <= 1) return;

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; // Tracking the left array
        int j = 0; // Tracking the right array

        for(; i< length;i++){
            if(i < middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(leftArray,rightArray,array);

    }

    static void merge(int[] leftArray, int[] rightArray, int[] array){
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0;

        while(l < leftSize && r < rightSize){
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else{
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }

    static void printArray(int[] A){
        for(int item : A){
            System.out.println(item);
        }
    }
}

/*

Time Complexity: O(nlogn)

It's Divider Conquor Technique

Advantages:
    1. Faster than Bubble, Insertion and Selection sort
    2. Best case O(n) compared to Selection Sort which is O(n^2)

Disadvantages: Takes more space O(n)

*/