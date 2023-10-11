package com.company;

import java.lang.reflect.Array;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.stream.IntStream;


public class Main {

    public static StringBuilder fixString(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < str.length(); i += 2){
            result.append(str.charAt(i));
            result.append(str.charAt(i - 1));
        }
        if (str.length() % 2 == 1){
            result.append(str.charAt(str.length() - 1));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(fixString("123456"));
        System.out.println(fixString("hTsii  s aimex dpus rtni.g"));
        System.out.println(fixString("badce"));


    }
}
