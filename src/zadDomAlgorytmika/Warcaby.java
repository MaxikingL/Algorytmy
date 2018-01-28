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


    public void plansza(int x, int y, char color) {

        this.x = x;
        this.y = y;

        //pobranie koloru
        char[][] plansza = new char[getX()][getY()];

        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza.length; j++) {
                if(i == 0 && j==0){
                    plansza[i][j] = color;
                }
                else if(j ==0){
                    plansza[i][j] = plansza[i-1][j] == 'w' ? 'b' : 'w';
                }
                else {
                    plansza[i][j] = plansza[i][j-1] == 'w' ? 'b' : 'w';
                }
            }
        }

        for (int i = 0; i < plansza.length; i++) {
            for (int j = 0; j < plansza.length; j++) {
                System.out.print(plansza[i][j]);
            }
            System.out.print("\n");
        }
    }
}











