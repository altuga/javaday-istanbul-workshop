package com.kodcu.question11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * Altug Bilgin Altintas
 * email : altug@kodcu.com
 * Effective Java
 *
 *
 */

public class ReadFile {

    public static void main(String[] args) throws Exception{

    }


    private static String firstLineOfFile(String path) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }
}
