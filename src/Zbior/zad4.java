package Zbior;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj słowo: ");
        char[] word = sc.nextLine().toCharArray();



        boolean isUpper = false;
        for (int i = 0; i <word.length ; i++) {
            if(Character.isUpperCase(word[i]) && i!=0)
            System.out.print(" "+Character.toLowerCase(word[i]));
               else
            System.out.print(word[i]);


            }

        }


    }

