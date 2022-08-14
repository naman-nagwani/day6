package com.bridgelabz;

import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number");
        n=scan.nextInt();
        for (int i=1;i<n;i++){
            if (n%i==0)
                sum+=i;
        }
        if (sum==n)
            System.out.println(n+" is a perfect number");
        else
            System.out.println(n+" is not a perfect number");
    }
}
