package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import cards.Card;
import cards.Card.Suit;
import cards.Card.Value;

public class CardTest {
	Card c = new Card(Value.ACE, Suit.SPADES);

	@Test(expected = IllegalArgumentException.class)
	public void constrNullVal() {
		new Card(null, Suit.CLUBS);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void constrNullSuit() {
		new Card(Value.ACE, null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void constrNullValSuit() {
		new Card(null, null);
	}
	
	@Test
	public void val() {
		assertEquals(c.val(), Value.ACE);
	}
	
	@Test
	public void suit() {
		assertEquals(c.suit(), Suit.SPADES);
	}
}
