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
		if (n < 0) {
			throw new IllegalArgumentException("Must specify a non-negative number of decks");
		}
		
		cards = new LinkedList<Card>();
		
		for (int i = 0; i < n; i++) {
			for (Suit s : Suit.values()) {
				for (Value v : Value.values()) {
					cards.add(new Card(v, s));
				}
			}
		}
	}
	
	public Deck(List<Card> cards) {
		for (Card c : cards) {
			if (c == null) {
				throw new IllegalArgumentException("Deck cannot contain null cards");
			}
		}
		this.cards = cards;
	}
	
	public int numCards() {
		return cards.size();
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		if (cards.size() == 0) {
			return null;
		}
		
		return cards.remove(0);
	}
	
	public void addTop(Card c) {
		add(0, c);
	}
	
	public void addBot(Card c) {
		add(-1, c);
	}
	
	private void add(int pos, Card c) {
		if (c == null) {
			throw new IllegalArgumentException("Card cannot be null");
		}
		
		if (pos == -1) {
			cards.add(c);
		} else {
			cards.add(pos, c);
		}
	}
}
