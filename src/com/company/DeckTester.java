package com.company;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String listOne[] = {"card", "card btw"};
        String listTwo[] = {"2", "4", "6"};
        int intArray[] = {1, 2, 3};
        Deck myDeck = new Deck(listOne, listTwo, intArray);
        System.out.println(myDeck.toString());
    }
}