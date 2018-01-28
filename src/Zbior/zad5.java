package Zbior;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {

        String[] daysOfTheWeek = {"Pn", "Wt", "Sr", "Czw", "Pt", "Sb", "Nd"};

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe dni o ktore ma sie przeniesc: ");
        int dni = Integer.parseInt(sc.nextLine());
        String dzienStartowy = sc.nextLine();

        int indeksDnia = 0;


        for (int i = 0; i < daysOfTheWeek.length; i++) {
            if (dzienStartowy.equals(daysOfTheWeek[i])) {

                indeksDnia = i;
                break;
            }
        }
        int wydrukuj=(dni+indeksDnia)%7;
        System.out.println(daysOfTheWeek[wydrukuj]);

    }
}

