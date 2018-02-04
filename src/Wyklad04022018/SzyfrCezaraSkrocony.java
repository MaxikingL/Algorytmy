package Wyklad04022018;

import java.util.HashMap;

public class SzyfrCezaraSkrocony {
    public static void main(String[] args) {

        HashMap<Integer,String> szyfrCezara = new HashMap<>();
        szyfrCezara.put(0,"A");
        szyfrCezara.put(1,"B");
        szyfrCezara.put(2,"C");
        szyfrCezara.put(3,"D");
        szyfrCezara.put(4,"E");
        szyfrCezara.put(5,"F");

        System.out.println(szyfrCezara.get(0+3));

        szyfrCezara.remove("A");
        System.out.println();


    }
}
