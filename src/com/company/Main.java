package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(countEventNumber(new int[]{ 1, 2, 3, 4, 5,6}));
    }

    public static int countEventNumber(int [] numbers) {
        int count = 0;
        for (int i : numbers) {
            if (i%2 == 0 ) {
                count++;
            }
        }
        return count;
    }

}
