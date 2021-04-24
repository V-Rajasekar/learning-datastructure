package algorithm;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int input [] = new int[] {3, 5, 9, 8, 2, 1, 4, 7, 6};
        selectionSort(input);
        System.out.println(" " + Arrays.toString(input));
    }

    private static void selectionSort(int [] a) {

        for (int i = 0; i < a.length -1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
           swap(a, min, i);
        }
    }

    private static void swap(int[] a, int min, int i) {
        int temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }
}
