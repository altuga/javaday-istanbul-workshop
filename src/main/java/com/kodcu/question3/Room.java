package com.kodcu.question3;

// An autocloseable class using a cleaner as a safety net (Page 32)
public class Room implements AutoCloseable {


    int numJunkPiles; // Number of junk piles in this room

    public Room(int numJunkPiles) {
        this.numJunkPiles = numJunkPiles;
    }

    @Override
    public void close() {
        System.out.println("Cleaning room");
        numJunkPiles = 0; // Number of junk piles in this room
    }
}
