
//This class represents a playing cards hand.
//Cards can be played from and/or added to the hand.

//Deck values: 1-52 (Clubs, Diamonds, Hearts, Spades)
//Face values: 2-14 (2-10, J, Q, K, A)
//Suit values: 1-4 (Clubs, Diamonds, Hearts, Spades)

import java.util.ArrayList;
import java.util.Random;

public class CardHand {
	private final String EMPTY_HAND = "Empty hand";
	
	private ArrayList<Card> cards = new ArrayList<>();
	
	private Random random = new Random();//Random number generation 
	
	//Empty hand.
	//Allows a hand to be built up by adding cards to it.
	public CardHand(){
		//Do nothing
	}
	public CardHand(int[] deckValues){
		for(int i = 0; i < deckValues.length; i++){
			Card card = new Card(deckValues[i]);
			cards.add(card);
		}
	}
	public CardHand(Card[] cards){
		for(int i = 0; i < cards.length; i++){
			Card card = new Card(cards[i].getDeckValue());
		}
	}
}
