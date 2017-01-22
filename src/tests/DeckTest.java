package tests;

import org.junit.Test;
import static org.junit.Assert.*;

import cards.Deck;

public class DeckTest {

	@Test
	public void defaultConstr() {
		Deck d = new Deck();
		assertEquals(d.numCards(), 52);
	}

}
