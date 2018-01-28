package zadDomAlgorytmika;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char[] answerJake = sc.nextLine().toCharArray();
        char[] answeZenek = sc.nextLine().toCharArray();
        char[] answerBogdan = sc.nextLine().toCharArray();
//
//        char[] answerJake = new char[]{'A','B','C','D','A','B','C','D'};
//        char[] answeZenek =new char[]{'A','B','A','B','A','B','A','B'};
//        char[] answerBogdan =new char[]{'A','B','A','B','A','B','A','B'};

        int[] answerCorrect = new int[answerBogdan.length];

        int counter = 0;
        boolean jake = false;

        for (int i = 0; i < answerJake.length; i++) {


            if (answerJake[i] != answerBogdan[i]) {
                answerCorrect[counter]++;

                if(answerJake[i]!=answeZenek[i]) {
                    answerCorrect[counter]++;
                }


            }


        }
        System.out.printf("%d",answerCorrect[0]);


    }
}

