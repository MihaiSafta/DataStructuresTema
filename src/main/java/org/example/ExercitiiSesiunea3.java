package org.example;

import java.util.*;

public class ExercitiiSesiunea3 {
    private static Scanner sc;
    public static void main(String[] args) {


        //nr minim
    /*

        int[] n = new int[20];
        Scanner myInput = new Scanner(System.in);
        int b = -1;
        System.out.print("Introduceti numerele: ");
        do {
            b++;
            n[b] = myInput.nextInt();
        }
        while (n[b] != 0);

        int min = n[0];
        for(int i = 1; i< b; i++) {
            if(n[i]<min) {
                min = n[i];
            }
        }
        System.out.print(min);
    }
*/

// 1. Se citesc numere intregi pana la intalnirea lui zero.
//a. Sa se formeze un array cu numerele pozitive si unul cu numerele negative. Apoi sa se afiseze alternativ elemente din fiecare array.
//b. Sa se afiseze numerele citite in ordinea inversa citirii lor.
//c. Sa se afiseze toate numere citite, insa o singura data (fara duplicate).
//Numerele citite in ordine crescatoare.

        //1. Citit nr pana la 0
//            int[] n = new int[20];
//            Scanner myInput = new Scanner(System.in);
//            int b = 0;
//            do {
//                System.out.print("Enter the " + (b + 1) + " integer: ");
//                n[b] = myInput.nextInt();
//                b++;
//            }
//            while (n[b - 1] != 0);
//
//            for (int i = 0; i < n.length; i++) {
//                if (n[i] > 0) {
//                    System.out.print(n[i] + ", ");
//                }
//            }

        int Size, i;
        sc = new Scanner(System.in);
        System.out.print(" Please Enter Number of elements in an array : ");
        Size = sc.nextInt();
        Integer[] a = new Integer[Size];
        System.out.print(" Please Enter " + Size + " elements of an Array  : ");
        for (i = 0; i < Size; i++) {
            a[i] = sc.nextInt();
        }

        for (i = 0; i < Size; i++) {
            if (a[i] >= 0) {
                System.out.println("Positive Number:" + a[i]);
            } else {
                System.out.println("Negative Number:" + a[i]);
            }
        }
        //duplicat

        for (int k = 0; k < a.length - 1; k++) {
            if (a[k + 1] == a[k]) {
                System.out.println("Duplicate element found :" + a[k]);
                k = k + 1;

            }

        }


        //reverse order array

        Arrays.sort(a,Collections.reverseOrder());
        System.out.println("String Array Elements in reverse order:");
        for(int p=0;p<a.length;p++)
            System.out.println(a[p]);
    }
}







