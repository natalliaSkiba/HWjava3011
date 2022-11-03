package org.example;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int a[] = new int[15];
        Random r = new Random(0);

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(10);
        }
        System.out.println(Arrays.toString(a));

        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                j++;
        }
        System.out.println("количество четных элементов в массиве = " + j);
    }
}
