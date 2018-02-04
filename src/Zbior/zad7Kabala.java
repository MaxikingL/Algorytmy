package Zbior;

import java.util.HashMap;
import java.util.Scanner;

public class zad7Kabala {
    public static void main(String[] args) {

        HashMap<String,Integer> tablica = new HashMap<>();

        tablica.put("A",1);
        tablica.put("B",2);
        tablica.put("C",3);
        tablica.put("D",4);
        tablica.put("E",5);
        tablica.put("F",6);
        tablica.put("G",7);
        tablica.put("H",8);
        tablica.put("I",9);
        tablica.put("K",10);
        tablica.put("L",20);
        tablica.put("M",30);
        tablica.put("N",40);
        tablica.put("O",50);
        tablica.put("P",60);
        tablica.put("Q",70);
        tablica.put("R",80);
        tablica.put("S",90);
        tablica.put("T",100);
        tablica.put("V",200);
        tablica.put("X",300);
        tablica.put("Y",400);
        tablica.put("Z",500);

        Scanner sc = new Scanner(System.in);
//        char[] slowo = sc.nextLine().toUpperCase().trim().toCharArray();
        String slowo = sc.nextLine().toUpperCase().trim();


        int suma=0;

        for (int i = 0; i <slowo.length(); i++) {
            suma += tablica.get(slowo.substring(i,i+1));

        }
        System.out.println(suma);



    }

}
