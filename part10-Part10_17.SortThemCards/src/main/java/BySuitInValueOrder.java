import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    public int compare(Card c1, Card c2) {
        return ((c1.getSuit().ordinal()+1)*10 + c1.getValue()) - ((c2.getSuit().ordinal()+1)*10 + c2.getValue());
    }
}
