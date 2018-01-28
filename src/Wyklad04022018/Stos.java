package Wyklad04022018;

import java.util.Stack;

public class Stos {
    public static void main(String[] args) {

        Stack<Integer> Stos = new Stack<>();

        int Liczba = 22;
        int podstawa = 2;

        do{


                Stos.push(Liczba % podstawa);
                Liczba = Math.floorDiv(Liczba,podstawa);
            }while(Liczba>0);

        while(!Stos.empty()){
            System.out.println(Stos.pop());


        }


    }
}
