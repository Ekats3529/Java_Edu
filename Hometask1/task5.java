package org.example;

import java.lang.reflect.Array;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.stream.IntStream;


public class Main {

    public static boolean isPalindromeDescendant(int x) {
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        System.out.print(sb + " -> ");
        while (sb.length() > 1) {
            StringBuilder rev = new StringBuilder(sb);
            if ((sb.toString()).equals(rev.reverse().toString())) {
                return true;
            }
            StringBuilder tmp = new StringBuilder();
            for (int i = 1; i < sb.length(); i += 2) {
                tmp.append((Character.getNumericValue(sb.charAt(i)) +  Character.getNumericValue(sb.charAt(i - 1))));
            }
            System.out.print(tmp + " -> ");
            sb = tmp;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeDescendant(11211230));
        System.out.println(isPalindromeDescendant(13001120));
        System.out.println(isPalindromeDescendant(23336014));
        System.out.println(isPalindromeDescendant(11));
        System.out.println(isPalindromeDescendant(1111112));
    }
}
