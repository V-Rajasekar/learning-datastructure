package algorithm;

import java.util.Arrays;

/**
 * ALgorithm is to divide an array into two sections a sorted section and an unsorted section
 * and at each step of the algorithm a number is moved from unsorted to sorted section until the
 * entire array is sorted
 */
public class InsertionSort {

    public static void main(String[] args) {
        int [] a = new int [] {25, 47, 3, 19, 8,18};

        for (int i = 1; i < a.length ; i++) {
            int element = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > element) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = element;
        }

        System.out.println(Arrays.toString(a));
    }



}
