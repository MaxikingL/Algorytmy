package Zajecia2701;

import java.util.Scanner;

public class CezarWdrugaStrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char [] letters1={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','w','x','y','z'};

        Scanner sc1 = new Scanner(System.in);
        char[]toCode = sc1.next().toCharArray();  //sam .next() jest Stringiem  a toCharArray rozbija znaki na tablice znakow
        int key = sc1.nextInt();

        for (int i = 0; i <toCode.length ; i++) {
            int letter1=0;
            for (int j = 0; j <letters1.length; j++) {
                if(letters1[j]==toCode[i]){
                    letter1=j;
                    break;
                }
            }
            System.out.println(letters1[(letter1-key)%26]);

        }

    }

}




//        char[] letters1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'w', 'x', 'y', 'z'};
//        char[] toCode1 = sc.next().toCharArray();
//        int key1 = sc.nextInt();
//
//        for (int i = 0; i < toCode1.length; i++) {
//            int letter1 = 0;
//            for (int j = 0; j < letters1.length; j--) {
//                if (letters1[j] == toCode1[i])
//                    letter1 = j - key1;
//                break;
//
//            }
//
//        }
//        System.out.println(letters1[(letters + key1) % 26]);
//    }
//    }
//}
