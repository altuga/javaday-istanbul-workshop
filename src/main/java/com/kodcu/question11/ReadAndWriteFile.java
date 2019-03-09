package com.kodcu.question11;

import java.io.*;

/**
 * Altug Bilgin Altintas
 * email : altug@kodcu.com
 * Effective Java
 *
 *
 */

public class ReadAndWriteFile {


    private static final int BUFFER_SIZE = 1000;

    public static void main(String[] args) {

    }


    private static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0)
                    out.write(buf, 0, n);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }
}
