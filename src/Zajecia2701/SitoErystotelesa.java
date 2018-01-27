package Zajecia2701;

import java.util.Scanner;

public class SitoErystotelesa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean[] tablica = new boolean[n+1];

        for (int i = 0; i <tablica.length ; i++) {
                     tablica[i]=true;

        }
        for (int i = 2; i <tablica.length ; i++) {
            for (int j = i+i; j < tablica.length; j+=i) {
                tablica[j]= false;

                }
            }
        for (int i = 0; i <tablica.length ; i++) {
            if(tablica[i])
            System.out.printf(" %d ", i);
        }



        }

    }

