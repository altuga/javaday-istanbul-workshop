package com.kodcu.question02;


/**
 * Altug Bilgin Altintas
 * email : altug@kodcu.com
 * Effective Java
 *
 *
 */

public class Sum {
    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i;
        return sum;
    }

    public static void main(String[] args) {

        long start = System.nanoTime();
        sum();
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000. + " ms..");



    }
}