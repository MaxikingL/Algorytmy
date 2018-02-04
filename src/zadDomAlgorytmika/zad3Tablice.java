package zadDomAlgorytmika;

public class zad3Tablice {
    public static void main(String[] args) {

<<<<<<< HEAD
        int[] dominantaT = new int[]{1, 2, 2, 2, 2, 3, 4, 4, 1, 4, 5, 5};
=======
<<<<<<< HEAD
        int[] dominantaT = new int[]{1, 2, 2, 2, 2, 3, 4, 4, 1, 4, 5, 5};
=======
        int[] dominantaT = new int[]{1, 2, 2, 2, 2, 3, 4, 4, 4, 4, 5, 5};
>>>>>>> master
>>>>>>> master

        int[] L = new int[dominantaT.length];

        int max = -1;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> master
        for (int i = 0; i < dominantaT.length; i++) {
            if (max < dominantaT[i]) {
                max = dominantaT[i];

            }
<<<<<<< HEAD
=======
=======
        for (int i = 0; i <dominantaT.length ; i++) {
            if(max<dominantaT[i]){
                max=dominantaT[i];

            }

>>>>>>> master
>>>>>>> master
        }
        //zliczanie

        for (int i = 0; i < dominantaT.length; i++) {
            L[dominantaT[i]]++;
        }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> master
        int max2 = 0;
        int index=0;

        for (int i = 0; i < L.length; i++) {
            if (max2 < L[i]) {
                max2 = L[i];

            }

        }
        for (int i = 0; i < L.length; i++) {
            if (L[i] >= max2)
                System.out.printf("element %d wystapil= %d razy czyli najwiecej ", i, L[i]);

        }
<<<<<<< HEAD
=======
=======

        for (int i = 0; i <max+1 ; i++) {
            System.out.printf("element %d wystapil= %d razy ",i,L[i]);
            System.out.println();





        }





>>>>>>> master
>>>>>>> master
    }
}