import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Hand implements Comparable<Hand>{
    private List<Card> list;


    public Hand(){
        this.list = new ArrayList<>();
    }

    public void add(Card card){
        list.add(card);

    }
    public void print(){
        Iterator<Card> iterator = list.iterator();
        while (iterator.hasNext()) {
            Card nextInLine = iterator.next();
            System.out.println(nextInLine);
        }
    }

    public void sort(){
        Collections.sort(list);
    }
    public int sumOfCards(){
        return list.stream()
                .mapToInt(Card::getValue)
                .sum();
    }

    public int compareTo(Hand hand){
        if(this.sumOfCards() != hand.sumOfCards()){
            return this.sumOfCards() - hand.sumOfCards();
        } else {
            return 0;
        }
    }

    public void sortBySuit(){
        BySuitInValueOrder sorted = new BySuitInValueOrder();
        Collections.sort(list, sorted);
    }

}
