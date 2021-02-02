package org.example;


import java.util.Scanner;

public class Exercitii {

        public static void main( String args[] ) {
            Scanner myInput = new Scanner(System.in);
            int a, b;

            System.out.print("Enter first integer: ");
            a = myInput.nextInt();
            System.out.print("Enter second integer: ");
            b = myInput.nextInt();


            System.out.println("Sum is :" + sumOfNumbers(a,b));
            System.out.println("Higher number is " + max(a,b));

            System.out.println("Quotient is " + quotient(a,b) + " and " + " remainder is " + remainder(a,b));
        }

        public static  int sumOfNumbers(int a,int b){
            return a+b;
        }

        public static  int max(int a,int b){
        return Math.max(a,b);
        }

        public static int remainder(int a,int b){
        return Math.max(a,b)%Math.min(a,b);
        }

        public static int quotient(int a,int b){
        return Math.max(a,b)/Math.min(a,b);
         }


    }



