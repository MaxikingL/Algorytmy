import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card1> deck = new ArrayList<>();
    public Deck(){
        for (int i = 0; i <=12 ; i++) {
            for (int j = 0; j <=3 ; j++) {
                deck.add(
                        new Card1(Colors.getValueBasedOnInt(j),figures.getValueBasedOnInt(i))
                );

            }
        }
    }
    public void printAll(){
        for (Card1 card:deck) {
            System.out.println(card);

        }
    }
    public void shuffle(){
        Collections.shuffle(deck);
    }
}
