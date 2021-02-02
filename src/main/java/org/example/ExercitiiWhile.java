package org.example;

import java.util.Scanner;

public class ExercitiiWhile {
    public static void main(String[] args)
    {
        int i = 1;
        int count,total = 0;
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the value n : ");

        int n = Sc.nextInt();

        System.out.println("Numbers are : ");

        while(i<=n)
        {
            System.out.println(i);
            i++;

        }

        for(count = 1; count <= i; count++){
            total = total + count;
        }
        System.out.println("Sum of first "+ i +" natural numbers is: "+ total);

    }
}

