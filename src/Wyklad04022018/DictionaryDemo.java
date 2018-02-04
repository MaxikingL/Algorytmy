package Wyklad04022018;


import java.util.HashMap;

public class DictionaryDemo {
    public static void main(String[] args) {

        HashMap<Integer,String> dzieci = new HashMap<>();

        int test = 5;
        String testValue = "5555";


        dzieci.put(1,"kowalski");
        dzieci.put(2,"zzz");
        dzieci.put(test,testValue);

        String ele = dzieci.get(1);
    }

}
