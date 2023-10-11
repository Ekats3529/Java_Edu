package com.company;

import java.util.logging.Logger;
import java.util.Arrays;


public class Main {

    public static Integer minutesToSeconds(String time){
        String[] separate = time.split(":");
        int minutes = Integer.parseInt(separate[0]);
        int seconds = Integer.parseInt(separate[1]);

        if (seconds > 59){
            return -1;
        }
        return minutes * 60 + seconds;
    }

    public static void main (String[] args) {
        System.out.println(minutesToSeconds("01:00"));
        System.out.println(minutesToSeconds("13:56"));
        System.out.println(minutesToSeconds("10:60"));
        System.out.println(minutesToSeconds("9999:00"));
        System.out.println(minutesToSeconds("9999:9999"));
        System.out.println(minutesToSeconds("00:59"));
    }
}
