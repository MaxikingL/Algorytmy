package algorytmy2;


public class PrzeszukiwanieTablicy {
    public static void main(String[] args) {//trim usuwa wszystkie znaki niedrukowane np; spacja

        String input = "4[1,4,78,3]";

        int number = Integer.parseInt(input.substring(0, input.indexOf("[")).trim());
        String values = input.substring(input.indexOf("[") + 1, input.indexOf("]")).trim();
        String[] val = values.split(",");

        int[] valuesInt = new int[val.length];
        for (int i = 0; i < val.length; i++) {
            valuesInt[i] = Integer.parseInt(val[i]);

        }
        int index = -1;
        for (int i = 0; i < valuesInt.length; i++) {
            if (valuesInt[i] == number) {
                index = i + 1;
                break;
            }

        }System.out.println(index);


    }


}
