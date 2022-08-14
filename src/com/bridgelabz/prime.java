package com.bridgelabz;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        boolean flag = true;
        System.out.println("Enter any number");
        n = scan.nextInt();
        for (int i=2;i<n;i++){
            if (n%i==0)
                flag=false;
        }
        if (flag)
            System.out.println("Prime number");
        else
            System.out.println("Not a Prime number");
    }
}
