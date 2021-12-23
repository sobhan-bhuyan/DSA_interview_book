package com.sobhan.array;

public class EvenFirstOddLast {
    public static void main(String args[]) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int element : arr) {
            System.out.println(element);
            evenOdd(arr);
        }
    }

    public static void evenOdd(int[] arr) {
        int nextEven = 0, nextOdd = arr.length - 1;
        while (nextEven < nextOdd) {
            if (arr[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                int temp = arr[nextEven];
                arr[nextEven] = arr[nextOdd];
                arr[nextOdd--] = temp;
            }
        }
    }
}
