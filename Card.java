public class Card implements Comparable<Card>{

    public enum Value { DEUCE, THREE, FOUR, FIVE, SIX,
        SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE }

    public enum Suit { SPADES, HEARTS, CLUBS, DIAMONDS }

    private final Suit suit;
    private final Value value;

    public Card(Value value, Suit suit){
        this.value = value;
        this.suit = suit;
    }
    public Suit getSuit(){
        return suit;
    }

    public Value getValue (){
        return value;
    }

    public String toString (){
        return value.ordinal()+2+""+suit.toString().charAt(0);
    }

    public int compareTo(Card card) {
        return this.getValue().compareTo(card.getValue());
    }
}
