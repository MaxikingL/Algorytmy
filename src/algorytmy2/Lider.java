package algorytmy2;

public class Lider {
    public static void main(String[] args) {

        int[] array = new int[]{1,2,1,6,2};


        int max= Integer.MIN_VALUE;

        for (int i = 0; i <array.length ; i++) {
            if(max<array[i]){
                max=array[i];
            }
        }
        int[] Tabzlicz = new int[max+1];
        for (int i = 0; i <array.length ; i++) {
            Tabzlicz[array[i]]++;
        }
        int index=0;

        int max2=Integer.MIN_VALUE;
        for (int i = 0; i <Tabzlicz.length; i++) {
            if(max2<Tabzlicz[i]){
                max2=Tabzlicz[i];
                index=i;
            }
        }

            if(max2 >=Tabzlicz.length/2){
                System.out.println(index);
            }else{
                System.out.println(-1);
            }


        }


    }

