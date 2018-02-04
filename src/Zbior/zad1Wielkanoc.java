package Zbior;


import java.util.Scanner;

public class zad1Wielkanoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("podaj rok: ");

        int rok = sc.nextInt();

        //dzien
        float a=rok%19;
        float b= Math.floorDiv(rok,100);
        float c=rok%100;
        float d=Math.floorDiv((int) b,4);
        float e=b%4;
        float f= (int) Math.floor(((b/8)/25));
        float g = (int) Math.floor((b-f+1)/3);
        float h = (19*a+b-d-g+15)%30;
        float i = (int) Math.floor(c/4);
        float k = c%4;
        float l = (32+2*e+2*i-h-k)%7;
        float m = (float) Math.floor((a+11*h+22*l)/451);
        float p = 1+((h+l-7*m+114)%31);


        int dzien=(int)p;

//miesiac
        float a1=rok%19;
        float b1= Math.floorDiv(rok,100);
        float c1=rok%100;
        float d1=Math.floorDiv((int) b1,4);
        float e1=b1%4;
        float f1= (int) Math.floor(((b1/8)/25));
        float g1 = (int) Math.floor((b1-f+1)/3);
        float h1= (19*a1+b1-d1-g1+15)%30;
        float i1 = (int) Math.floor(c1/4);
        float k1 = c1%4;
        float l1 = (32+2*e1+2*i1-h1-k1)%7;
        float m1 = (float) Math.floor((a1+11*h1+22*l1)/451);
        float p1 = (float) Math.floor((h1+l-7*m1+114)/31);
        int  miesiac=(int)p1;


        if(miesiac==4){
            System.out.println(dzien+" kwiecien "+rok);
        }else{
            System.out.printf(dzien+" mrzec "+rok);

        }






    }
}
