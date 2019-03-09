package com.kodcu.question07;


/**
 * Altug Bilgin Altintas
 * email : altug@kodcu.com
 * Effective Java
 *
 *
 */

import java.time.Instant;

public final class Sub extends Super {

    // Blank final, set by constructor
    private final Instant instant;

    Sub() {
        instant = Instant.now();
    }

    // Overriding method invoked by superclass constructor
    @Override
    public void overrideMe() {
        System.out.println(instant);
    }
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}