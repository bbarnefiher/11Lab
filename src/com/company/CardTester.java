package com.company;
/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
        Card cardOne = new Card("1", "Clubs", 2);
        Card cardTwo = new Card("2", "Hearts", 6);
        Card cardThree = new Card("1", "Clubs", 2);

        System.out.println(cardOne.matches(cardThree));//true
        System.out.println(cardOne.matches(cardTwo));//false
        System.out.println(cardOne.pointValue());
        System.out.println(cardThree.suit());
        System.out.println(cardTwo.toString());
        System.out.println(cardTwo.rank());

    }
}