package cards;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import cards.Card.Suit;
import cards.Card.Value;

public class Deck {
	private List<Card> cards;
	
	public Deck() {
		this(1);
	}
	
	public Deck(int n) {
		cards = new LinkedList<Card>();
		
		for (int i = 0; i < n; i++) {
			for (Suit s: Suit.values()) {
				for (Value v: Value.values()) {
					cards.add(new Card(v, s));
				}
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
}
