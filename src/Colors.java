

public enum Colors {

    CLUBS(0),
    DIAMOND(1),
    HEARTS(2),
    SPADES(3);

    private int value;
    Colors(int value){
        this.value=value;

    }
    public int getValue(){return value;}

    public static Colors getValueBasedOnInt(int value) {
        for (Colors colors : Colors.values()) {
            if (colors.getValue() == value) {
                return colors;
            }
        }
        return CLUBS;
    }
}


