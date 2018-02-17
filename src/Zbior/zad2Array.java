package Zbior;

import java.util.ArrayList;
import java.util.List;

public class zad2Array {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        String lista = "4[1,2,2,3,4,2,4]";

        String toDelete = lista.substring(0, 1);
        int toDelete1 = Integer.parseInt(toDelete);

        boolean end= false;

        String[] numbers = lista.substring(2, 15).split(",");


        for (int i = 0; i < numbers.length; i++) {
            list.add(Integer.parseInt(numbers[i]));

        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == toDelete1) {
                list.remove(i);
                end=true;

            }

        }if(end==true)
        System.out.println(list);
        else
            System.out.printf("liczba %d nie wystepuje",toDelete1);
    }
}
