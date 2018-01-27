package Zajecia2701;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 0;

        try {
            n = sc.nextInt();

        } catch (Exception ex) {
            System.out.println("podales zle dane");
        }

        int suma = 0;

        for (int i = 0; i < n; i++) {

            try {
                suma += sc.nextInt();
                System.out.println(suma);


            } catch (Exception ex) {
                sc.nextInt();

                System.out.println(suma);

            }
        }
    }
}
