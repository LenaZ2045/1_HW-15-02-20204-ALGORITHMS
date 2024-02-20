package com.telran.org;

public class SumOfSquares {
    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num * num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {3, 6, 4, 7, 2, 1, 9};
        int result = sumOfSquares(array);
        System.out.println("Sum of squares for elements in the array = " + result);
    }
}