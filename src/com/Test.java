package com;

/**
 * Created by Rachana Rao on 3/13/2016.
 */
public class Test {

    public static void main(String[] args) {
        int[] a = {5, 8, 2, 7, 1, 3, 9, 1, 12, 43, 54, 14, 16, 15, 89, 67, 21, 42, 25, 27, 67, 36, 29, 71, 101, 501, 689, 457, 265, 94};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
        System.out.println();

        Test test = new Test();
        test.mergeSort(a, 0, a.length - 1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    private void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }

    private void merge(int[] a, int l, int m, int r) {

        int[] temp1 = new int[m + 1 - l];
        int[] temp2 = new int[r - m];

        for (int n = 0; n < temp1.length; n++) {
            temp1[n] = a[n + l];
        }

        for (int n = 0; n < temp2.length; n++) {
            temp2[n] = a[m + 1 + n];
        }
        int i = 0, j = 0, k = l;
        while (i < temp1.length && j < temp2.length) {
            if (temp1[i] <= temp2[j]) {
                a[k] = temp1[i];
                i++;
            } else {
                a[k] = temp2[j];
                j++;
            }
            k++;
        }
        for (int n = i; n < temp1.length; n++) {
            a[k++] = temp1[n];
        }
        for (int n = j; n < temp2.length; n++) {
            a[k++] = temp2[n];
        }
    }

}
