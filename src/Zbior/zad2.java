package Zbior;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj slowo: ");
        char[] word = sc.nextLine().toCharArray();



        for (int i = 0; i <word.length ; i++) {
            if(i%2==0){
                System.out.print(Character.toUpperCase(word[i]));
            }else{
                System.out.print(Character.toLowerCase(word[i]));

            }

        }
    }
}
