package com.kodcu.question11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) throws Exception{

    }


    private static String firstLineOfFile(String path) throws IOException {

        try( BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        } finally {

        }
    }
}
