package org.example;

import java.util.Arrays;

public class Main {


    public static String highAndLow(String nums) {
        String[] array = nums.split(" ");
        String result1 = null;
        String result2 = null;
        int size = array.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        Arrays.sort(arr);
        result2 = Integer.toString(arr[0]);
        result1 = Integer.toString(arr[arr.length - 1]);
        return result1 + " " + result2;
    }

}
