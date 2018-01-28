package algorytmy2;

public class PrzeszukiwanieTablicy2 {
    public static void main(String[] args) {


        int[] array = new int[]{1, 4, 78, 3};



        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int arrayMax = 0;
        int arrayMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                arrayMin = i;
            }
            if (max < array[i]) {
                max = array[i];
                arrayMax = i;
            }
        }
        System.out.printf(" Min:%d(%d)\n Max:%d(%d)", arrayMin, min, arrayMax, max);


    }
}
