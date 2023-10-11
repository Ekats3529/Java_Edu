package com.company;

import java.lang.reflect.Array;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.stream.IntStream;


public class Main {

    public static boolean isNestable(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int mx_a = a[a.length - 1];
        int mx_b = b[b.length - 1];
        int mn_a = a[0];
        int mn_b = b[0];

        return mn_a > mn_b && mx_a < mx_b;
    }

    public static void main(String[] args) {
        System.out.println(isNestable(new int[]{1, 2, 3, 4}, new int[] {0, 6}));
        System.out.println(isNestable(new int[]{3, 1}, new int[] {4, 0}));
        System.out.println(isNestable(new int[]{9, 9, 8}, new int[] {8, 9}));
        System.out.println(isNestable(new int[]{1, 2, 3, 4}, new int[] {2, 3}));


    }
}
