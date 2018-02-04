package Zbior;


public class zad1zmienne {
    public static void main(String[] args) {


        String[] tab = new String[]{"1", "5", "1", "40","5", "1"};


        String liczba;


        for (int i = 0; i < tab.length; i++) {
            liczba = tab[i];
            if (liczba.equals(tab[i])) {
                String szukanaLiczba = tab[i];


                for (int j = i + 1; j < tab.length; j++) {
                    if (szukanaLiczba.equals(tab[j])) {

                        String pierwszeWystapienie = tab[j];
                        i++;


                        for (int k = j+2; k < tab.length; k++) {
                            i++;

                            if (pierwszeWystapienie.equals(tab[k])) {

                                String drugieWystąpienie = tab[k];
                                System.out.println(liczba + " " + j + " " + k);


                            }



                        }
                    }else{
                        System.out.println("nie ma");
                }
            }
            }
        }

    }
}
