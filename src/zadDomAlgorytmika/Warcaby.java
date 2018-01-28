package zadDomAlgorytmika;


import java.util.Scanner;

public class Warcaby {

    public int x;
    public int y;
    public String c;


    public int getX() {
        return x;
    }

    public void setX() {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY() {
        this.y = y;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }


    public void plansza(int x, int y) {

        this.x = x;
        this.y = y;

        //pobranie koloru
        System.out.println("podaj kolor: ");
        Scanner white = new Scanner(System.in);


        int[][] plansza = new int[getX()][getY()];

        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza.length; j++) {

//                String kolor= white.nextLine().toLowerCase();

                plansza[i][j] = (i == j) ? i : 'l';

            }


        }

    }


    //        boolean white = false;
//
//        for (int i = 0; i < plansza.length; i++) {
//            for (int j = 0; j < plansza.length; j++) {
//
//
//
//            }
//        }
//    }


    }












