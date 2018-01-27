package Zajecia2701;

public class Silnia {
    public static void main(String[] args) {
        System.out.println(silnie(4));

    }
    public static int silnie(int n){ //metoda
        if(n==1)
            return 1;
        else
            return silnie(n-1) * n;

    }
}
