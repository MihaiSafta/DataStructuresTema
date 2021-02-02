package org.example;

import java.util.*;

public class ExercticiiNumePers {

    public static void countFreq( String a[], int n)
    {
        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(a[i] + " " + count);
        }
    }

    public static void main(String []args)
    {
        ArrayList<String> list = new ArrayList<String>();
        int Size, i;
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please Enter Number of elements in an array : ");
        Size = sc.nextInt();
        String[] a = new String[Size];
        System.out.print(" Please Enter " + Size + " the names  : ");

        for (i = 0; i < Size; i++) {
            a[i] = sc.next();
        }
        for (i = 0; i < Size; i++) {
            System.out.println(" Numbers are : " + a[i]);
        }

        int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };
        int n = arr.length;
       countFreq(??, n);//HELP?
    }
}




