package Zajecia2701;

import java.util.Scanner;

public class szyfrCezara {
    public static void main(String[] args) {

        char [] letters={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','w','x','y','z'};

        Scanner sc = new Scanner(System.in);
        char[]toCode = sc.next().toCharArray();  //sam .next() jest Stringiem  a toCharArray rozbija znaki na tablice znakow
        int key1 = sc.nextInt();

        for (int i = 0; i <toCode.length ; i++) {
            int letter=0;
            for (int j = 0; j <letters.length; j++) {
                if(letters[j]==toCode[i]){
                    letter=j;
                    break;
                }
            }
            System.out.println(letters[(letter+key1)%26]);
            
        }

    }

}
