public class Card1 {

    Colors color;
    figures figures1;

    public Colors getColor(Colors color, figures figures1) {
        return color;
    }

    public Card1(Colors color, figures figures1) {
        this.color = color;
        this.figures1 = figures1;
    }

    public Colors getColor() {
        return color;
    }

    public figures getFigures1() {
        return figures1;
    }

    @Override
    public String toString() {
        return figures1.name() + " " + color.name();
    }
}
