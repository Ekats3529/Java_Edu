package com.company;

import java.util.logging.Logger;
import java.util.Arrays;


public class Main {

    public static int countDigits(int digit) {
        int result = 1;
        while (digit > 9) {
            result++;
            digit /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(4666));
        System.out.println(countDigits(544));
        System.out.println(countDigits(1234567890));
        System.out.println(countDigits(0));
        System.out.println(countDigits(5));

    }
}
