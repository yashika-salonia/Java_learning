package arrays;

import java.util.Arrays;

public class MergeSort {
    static int count = 0;  // Count operations

    public static void main(String[] args) {
//        int[] a = {4, 1, 30, 20, 10,4,12,3,55,7,8,9,3,2,6};
        int[] a={1,2,3,4,5,6};
        int n = a.length;
        M_Sort(a, 0, a.length);
        System.out.println("Answer: " + Arrays.toString(a));
        System.out.println("Count: " + count);
    }

    static void M_Sort(int[] a, int start, int end) {
        if (end - start == 1) {
            return;
        }

        int mid = (start + end) / 2;

        M_Sort(a, start, mid);
        M_Sort(a, mid, end);
        merge(a, start, mid, end);
    }

    static void merge(int[] a, int start, int mid, int end) {
        int[] mix = new int[end - start];
        int i = start, j = mid, pointer = 0;

        while (i < mid && j < end) {
            count++; // Counting comparisons
            if (a[i] < a[j]) {
                mix[pointer] = a[i];
                i++;
            } else {
                mix[pointer] = a[j];
                j++;
            }
            pointer++;
        }

        while (i < mid) {
            count++;  // Counting element assignment
            mix[pointer++] = a[i++];
        }

        while (j < end) {
            count++;  // Counting element assignment
            mix[pointer++] = a[j++];
        }

        // Copy sorted elements back into original array
        for (int l = 0; l < mix.length; l++) {
            count++;  // Counting assignments
            a[start + l] = mix[l];
        }
    }
}
