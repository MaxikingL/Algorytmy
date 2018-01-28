

public enum figures {
    ACE(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private  int values;
    figures(int valuesI){
        values=valuesI;
    }
    private int getValue(){
        return values;
    }

    public int getValues() {return values;}

    public static figures getValueBasedOnInt(int value){
       for(figures figures1: figures.values()){//foreach dostaje liste lub kolecje i wywoluje do odczytu
           if(figures1.getValue()==value){
               return figures1;
           }
       }
       return ACE;
    }

}
