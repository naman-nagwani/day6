/*
Write a static function sqrt to compute the square root of a non-negative number c
given in the input using Newton's method:
- initialize t = c
- replace t with the average of c/t and t
- repeat until desired accuracy reached using condition Math.abs(t - c/t) > epsilon*t
where epsilon = 1e-15;
*/
package com.bridgelabz;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c;
        double result;
        System.out.println("Enter number to find Square root of : ");
        c = scan.nextInt();
        result = Utility.sqrt(c);
        System.out.println(result);
    }
}
