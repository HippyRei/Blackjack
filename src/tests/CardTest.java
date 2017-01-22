package tests;

import org.junit.Test;

import cards.Card;
import cards.Card.Suit;
import cards.Card.Value;

public class CardTest {

	@Test(expected = IllegalArgumentException.class)
	public void constrNullVal() {
		Card c = new Card(null, Suit.CLUBS);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void constrNullSuit() {
		Card c = new Card(Value.ACE, null);
	}
}
