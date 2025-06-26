package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class ArrySort {

    static class ArrComparttor implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {

            if ((o1 % 2 == 0 && o2 % 2 == 0) || (o1 % 2 != 0 && o2 % 2 != 0)) {
                return o1.compareTo(o2);

            }
            if (o1 % 2 == 0)
                return -1;

            return 1;

        }

    }


    public static void main(String[] args) {

        Integer arr[] = {3, 6, 2, 8, 10, 1, 9};

        Arrays.sort(arr, new ArrComparttor());

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}


