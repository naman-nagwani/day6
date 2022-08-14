package com.bridgelabz;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n,a=0,b=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Number");
        n=scan.nextInt();
        System.out.print(a+" , "+b);
        for (int i =1 ;i<=n;i++){
            int c=a+b;
            System.out.print(" , "+c);
            a =b;
            b=c;
        }
    }
}
