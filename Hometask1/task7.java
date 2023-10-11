package org.example;

import java.lang.reflect.Array;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.lang.Math;
import java.lang.Double;


public class Main {

    public static int rotateRight(int n, int shift) {
        int cnt_bt = (int) Math.log(n);
        System.out.print((n >>> (shift % cnt_bt)) + " ");
        return (n >>> (shift % cnt_bt)) | (n << (Integer.SIZE - (shift % cnt_bt)));
    }


    public static int rotateLeft(int n, int shift) {
        System.out.print((n << shift) + " ");
        int cnt_bt = (int) Math.log(n);
        return (n << (shift % cnt_bt)) | (n >>> (Integer.SIZE - (shift % cnt_bt)));
    }

    public static void main(String[] args) {
        System.out.println(rotateRight(8, 1));
        System.out.println(rotateRight(8, 2));
        System.out.println(rotateRight(8, 5));
        System.out.println(rotateRight(6, 1));
        System.out.println(rotateLeft(16, 1));
        System.out.println(rotateLeft(17, 2));
    }
}
