/*
 * Copyright (c) Wang Qirui. All rights reserved.
 * Licensed under the MIT license. See LICENSE file in the project root for full license information.
 */

package com.qrwells.practices.no5;

public class Sorter {
    private final int[] values;

    public Sorter(int[] values) {
        this.values = values;
    }

    public void printArray() {
        for (int j : values) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }

    public int binarySearch(int k) {
        int low = 0;
        int high = values.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (k == values[mid])
                return mid;
            if (k > values[mid])
                low = mid + 1;
            if (k < values[mid])
                high = mid - 1;
        }
        return -1;
    }

    public void sortArray() {
        mergeSort(values, 0, values.length - 1);
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
        Sorter s = new Sorter(array);
        s.printArray();
        System.out.println(key + " at " + s.binarySearch(key));
        s.sortArray();
        s.printArray();
        System.out.println(key + " at " + s.binarySearch(key));
    }
}
