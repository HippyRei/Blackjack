package cards;

public class Card {
	public static enum Suit {
		CLUBS, DIAMONDS, SPADES, HEARTS
	}

	public static enum Value {
		ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
	}

	private Value v;
	private Suit s;

	public Card(Value v, Suit s) {
		if (v == null) {
			throw new IllegalArgumentException("Value cannot be null");
		}
		if (s == null) {
			throw new IllegalArgumentException("Suit cannot be null");
		}
		
		this.v = v;
		this.s = s;
	}

	public Value val() {
		return v;
	}

	public Suit suit() {
		return s;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Card)) {
			return false;
		}
		
		Card c = (Card) o;
		return this.v == c.v && this.s == c.s;
	}
}
