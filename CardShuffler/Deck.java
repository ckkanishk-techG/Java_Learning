/*
Out of pack -> 0 1 2 3 4 5 6 7 8 9

Deck spilt -> a) 0 1 2 3 4 
	      b) 5 6 7 8 9

Interlacing -> (S1) 0 5 1 6 2 7 3 8 4 9

S1 Deck Split -> a) 0 5 1 6 2
		 b) 7 3 8 4 9
Interlace ->(S2) 0 7 5 3 1 8 6 4 2 9

GOES ON 6 TIMES IN TOTAL
*/

public class Deck {

    private int[] cards;

    /**
     * Constructs a deck with numCards cards.
     */
    public Deck(int numCards) {
        /* code not shown */
    }

    /**
     * Part (a)
     * Postcondition: Returns true if the cards are in numerical order
     * from 0 to cards.length - 1; returns false otherwise.
     */
    public boolean inOrder() {
        for (int i=0;i<cards.length;i++){
		if(i != cards[i]){
			return false;
		}
	}
	return true;
    }

    /**
     * Part (b)
     * Postcondition: The deck is shuffled by dividing it into two
     * equal stacks that are evenly interlaced.
     */
    public void shuffle() {
        /* to be implemented in part (b) */
    }

    /**
     * Part (c)
     * Postcondition: Returns the number of shuffles necessary to
     * return the deck to its original numerical order.
     */
    public int reorderingCount() {
        /* to be implemented in part (c) */
        return 0;
    }
}
