package algorithm;

import java.util.Arrays;

/**
 * Quick sort uses divide and conquer algorithm to sort an array. Avg running time is n log(n) and worst is n log (n2)
 * it doesn't beat the merge sort worst run time which is n log(n).
 * Why do then use quick sort ? Quick sort uses in memory
 * to sort an array unlike merge sort
 * Heart of the algorithm is the partitioning process
 * 1. pick a pivot in the array and sort the elements less than the pivot in the left and greater than the pivot in right
 * 2. finally places the pivot value in its correct position in the array
 *
 */

public class QuickSort {
    public static void main(String[] args) {

//        int [] array = new int[] {12, 81, 74, 43, 1098, 0, 8, 92, 17, 754, 912, 0, 6, 4};

        int [] array = {1 , 3, 7, 10, 5, 8, 9, 6};
        quicksort(array, 0, array.length -1);
        System.out.println(Arrays.toString(array));
    }

    private static void quicksort(int[] array, int start, int end) {
       if (start < end) {

           int pp = partition(array, start, end); // pp is the pivot
             quicksort(array, 0, pp - 1); // sort left half of the range

         //  quicksort(array, pp + 1, end); // sort right half of the range

       }

    }

    private static int partition(int[] array, int p, int r) {
        int pivotVal = array[r];
        int i = p -1;
        for ( int j = p; j < r; j++) {
            if (array[j] <= pivotVal) {
                i++;
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[i+1];
        array[r] = temp;
        array[i+1] = pivotVal;
        System.out.println(i + " " + Arrays.toString(array));
        //
        return i+1;

    }
}
