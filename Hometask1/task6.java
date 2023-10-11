package org.example;

import java.lang.reflect.Array;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.lang.Math;


public class Main {

    public static int countK(int x, int ... n) {
        int cnt = 0;
        if (n.length == 1){
            cnt = n[0];
        }
        if (x == 6174){
            return cnt;
        }
        int[] nums = new int[4];
        for (int i =0; i<4; i++){
            nums[i] = x % 10;
            x /= 10;
        }
        Arrays.sort(nums);
        int mx = 0;
        int mn = 0;
        for (int i = 0; i < 4; i++){
            mx += nums[i] * Math.pow(10, i);
            mn += nums[4 - i - 1] * Math.pow(10, i);
        }
        return countK(mx - mn, cnt + 1);
    }

    public static void main(String[] args) {
        System.out.println(countK(3524));
        System.out.println(countK(6621));
        System.out.println(countK(6554));
        System.out.println(countK(1234));
        System.out.println(countK(6174));
        System.out.println(countK(8352));
    }
}
