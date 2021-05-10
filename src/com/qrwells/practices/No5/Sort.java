/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.No5;

public class Sort {
    static void printArray(int[] a) {
        for (int j : a) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }

    static int binarySearch(int[] a, int k) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (k == a[mid])
                return mid;
            if (k > a[mid])
                low = mid + 1;
            if (k < a[mid])
                high = mid - 1;
        }
        return -1;
    }

    static void sortArray(int[] a) {
        mergeSort(a, 0, a.length-1);
    }

    private static void mergeSort(int[] a, int s, int e) {
        int m = (s + e) / 2;
        if (s < e) {
            mergeSort(a, s, m);
            mergeSort(a, m + 1, e);
            merge(a, s, m, e);
        }
    }

    private static void merge(int[] a, int s, int m, int e) {
        int[] temp = new int[(e - s) + 1];
        int l = s;//left pointer
        int r = m + 1;//right pointer
        int i = 0;
        while (l <= m && r <= e) {
            if (a[l] < a[r])
                temp[i++] = a[l++];
            else
                temp[i++] = a[r++];
        }

        while (l <= m)
            temp[i++] = a[l++];

        while (r <= e)
            temp[i++] = a[r++];

        System.arraycopy(temp, 0, a, s, temp.length);

    }

    public static void main(String[] args) {
        int[] array = {
                100, 10, 1000, 50, 10000, 999, 5
        };
        int key = 10000;
        printArray(array);
        System.out.println(key + " at " + binarySearch(array, key));
        sortArray(array);
        printArray(array);
        System.out.println(key + " at " + binarySearch(array, key));
    }
}
