package Sortowania;

public class sortowanieBąbelkowe {
    public static void main(String[] args) {//sortowne liczb 54321
                                            //swap = zamiana elementow w tablicy

        int [] array = new int[]{5,4,3,2,1};



        for (int i = 0; i <array.length ; i++) {//element (blok) pierwszy
            for (int j = 0; j <array.length-1 ; j++) {// element (blok) drugi
                if(array[i]>array[j+1]){

                    //swap
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;

            }





            }

        }



    }
}
