package algorytmy2.MyList;

import java.util.ArrayList;

public class ListyDemo {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("Mercades");
        cars.add("Audi");
        cars.add("Skoda");

        for (int i = 0; i <cars.size() ; i++) {
            System.out.println(cars.get(i));

        }
        System.out.println();
        for (String car : cars){
            System.out.println(car);
        }


    }
}
