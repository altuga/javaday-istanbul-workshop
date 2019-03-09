package com.kodcu.question12;


import java.util.*;
/**
 * Altug Bilgin Altintas
 * email : altug@kodcu.com
 * Effective Java
 *
 *
 */

public class Symptom {

    static Collection<Card.Suit> suits = Arrays.asList(Card.Suit.values());
    static Collection<Card.Rank> ranks = Arrays.asList(Card.Rank.values());
    static List<Card> deck = new ArrayList<>();

    public static void main(String[] args) {



        for (Iterator<Card.Suit> i = suits.iterator(); i.hasNext(); )
            for (Iterator<Card.Rank> j = ranks.iterator(); j.hasNext(); ) {
                deck.add(new Card(i.next(), j.next()));
            }
    }
}
