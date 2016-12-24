package com.TreeTraversal;

import java.util.Scanner;

/**
 * Created by Rachana Rao on 3/17/2016.
 */
public class Manhatten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int len = sc.nextInt();
            int[] array = new int[len];
            int max = 0;
            for (int j = 0; j < len; j++) {
                array[j] = Integer.parseInt(sc.next());
                sc.next();
            }
            for (int j = 0; j < len; j++) {
                if (max < array[j])
                    max = array[j];
                array[j] = array[j] - 1;
            }

            for (int j = 0; j < len; j++) {
                array[array[j] % max] = array[array[j] % max] + max;
            }
            int res = 0, val = 0;
            for (int j = 0; j < len; j++) {
                if ((array[j] % max) > max) {
                    max = array[j] % max;
                    val = j + 1;
                }
            }
            System.out.println(val + " " + max);
        }
    }

    private int feb(int i) {
        if (i == 0 || i == 1)
            return i;
        else {
            return (feb(i - 1) + feb(i - 2));
        }
    }


}
