package Zbior;

import java.util.Scanner;

public class tablice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose the number:");
        int liczba = sc.nextInt();
        int indexNumner = 0;
        int failnumber = 0;


        int[] tab = new int[]{1, 2, 3, 4, 5};


        for (int i = 0; i < tab.length; i++) {

            if (liczba == tab[i])

                indexNumner = i;

            else

                failnumber = -1;
        }
        if (indexNumner != 0)
            System.out.printf("Index number is: %d", indexNumner);
        else
            System.out.println(failnumber);


        String tab1 = "6[1,9,78,4]";

        String toDelete = tab1.substring(0, 1);

        int indexNumner1 = 0;
        boolean end = false;

        String[] tab2 = tab1.substring(2, 10).split(",");

        for (int i = 0; i < tab2.length; i++) {

            if (toDelete.equals(tab2[i])) {
                end = true;
                indexNumner1 = Integer.parseInt(String.valueOf(i));
            }

        }
        if (end) {

            System.out.println();
            System.out.printf("Index number: %d", indexNumner1);

        }else {
            System.out.println();
            System.out.println(-1);
        }

    }
}
