package Zbior;

import java.util.HashMap;
import java.util.Scanner;

public class zad5ZliczLitery {
    public static void main(String[] args) {

        HashMap<Character, Integer> tablica = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        tablica.put('a', 0);
        tablica.put('b', 0);
        tablica.put('c', 0);
        tablica.put('d', 0);
        tablica.put('e', 0);
        tablica.put('f', 0);
        tablica.put('g', 0);
        tablica.put('h', 0);
        tablica.put('i', 0);
        tablica.put('j', 0);
        tablica.put('k', 0);
        tablica.put('l', 0);
        tablica.put('m', 0);
        tablica.put('n', 0);
        tablica.put('o', 0);
        tablica.put('p', 0);
        tablica.put('r', 0);
        tablica.put('s', 0);
        tablica.put('t', 0);
        tablica.put('w', 0);
        tablica.put('x', 0);
        tablica.put('y', 0);
        tablica.put('z', 0);


        int ile_liter = 0;

        char[] zdanie = sc.nextLine().trim().toCharArray();

        for (int i = 0; i < zdanie.length; i++) {
            tablica.replace(zdanie[i], tablica.get(zdanie[i]) +1);
        }
        for (Character letter:tablica.keySet()) {
            System.out.println(letter+" "+tablica.get(letter));
        }
    }

//        int wiersz = sc.nextInt();
//        String zdanie1 = sc.nextLine();
//        int slowo = Integer.parseInt(zdanie1);
//        char[] slowo1 = sc.nextLine().toUpperCase().toCharArray();
//        int [] iloscPowtorzen = new int[slowo.length];
//        int [] iloscPowtorzen1= new int[slowo1.length];
//
//
//        int max=-1;
//
//            for (int i = 0; i <slowo.length ; i++) {
//                if(max<)
//
//            }
//        }


}

