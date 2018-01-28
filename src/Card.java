public class Card {
    private static Card ourInstance = new Card();

    public static Card getInstance() {
        return ourInstance;
    }

    private Card() {
    }
}
