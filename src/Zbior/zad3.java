package Zbior;

import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("podaj słowo: ");
        char[] word = sc.nextLine().toCharArray();


        StringBuilder sb = new StringBuilder();
        boolean isUpper = false;
        for (int i = 0; i <word.length; i++) {
            if(word[i]!=' ')
                if(isUpper) {
                    sb.append(Character.toUpperCase(word[i]));
                    isUpper = false;
                }
                else
                    sb.append(word[i]);
            else
                isUpper = true;
        }

        System.out.println(sb.toString());
    }
}
