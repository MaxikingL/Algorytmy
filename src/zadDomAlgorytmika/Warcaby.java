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


<<<<<<< HEAD

    public void plansza(int x, int y, char color) {



=======
<<<<<<< HEAD
    public void plansza(int x, int y, char color) {
=======
    public void plansza(int x, int y) {
>>>>>>> master
>>>>>>> master

        this.x = x;
        this.y = y;

        //pobranie koloru
<<<<<<< HEAD
=======
<<<<<<< HEAD
        char[][] plansza = new char[getX()][getY()];
>>>>>>> master

        char[][] plansza1 = new char[getX()][getY()];

        for (int i = 0; i < plansza1.length; i++) {
            for (int j = 0; j < plansza1.length; j++) {
                if(i == 0 && j==0){
                    plansza1[i][j] = color;
                }
                else if(j ==0){
                    plansza1[i][j] = plansza1[i-1][j] == 'w' ? 'b' : 'w';
                }
                else {
                    plansza1[i][j] = plansza1[i][j-1] == 'w' ? 'b' : 'w';
                }
            }
        }

        for (int i = 0; i < plansza1.length; i++) {
            for (int j = 0; j < plansza1.length; j++) {
                System.out.print(plansza1[i][j]);
            }
            System.out.print("\n");
        }
    }
}



<<<<<<< HEAD
=======
    }

>>>>>>> master
>>>>>>> master











