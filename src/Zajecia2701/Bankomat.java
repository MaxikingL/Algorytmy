package Zajecia2701;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kwota = sc.nextInt();
        int[] nominalyZL =new int [] {500,200,100,50,20,10,5};
        int [] nominalyZurzycie= new int [nominalyZL.length];

        int aktualnyNominal=0;
        while(kwota>0){
            if(kwota>=nominalyZL[aktualnyNominal]){
                kwota-=nominalyZL[aktualnyNominal];
                nominalyZurzycie[aktualnyNominal]++;
            }else{
                aktualnyNominal++;
            }
        }

        for (int i = 0; i <nominalyZL.length ; i++) {
            if(nominalyZL[i]>0)
                System.out.printf("%d x %d", nominalyZL[i],nominalyZurzycie[i]);
            System.out.println();

            }

        }
        int[] grosze = new int []{50,20,10,5,2,1};
    int [] zuzycieGrosze= new int[grosze.length];



    }


