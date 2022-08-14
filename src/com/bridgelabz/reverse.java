package com.bridgelabz;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,temp,rev=0,dig;
        System.out.println("Enter any number");
        n = scan.nextInt();
        temp =n;
        while (temp!=0){
            dig=temp%10;
            rev = rev*10+dig;
            temp=temp/10;
        }
        System.out.println("Reverse of " +n+" is "+rev);
    }
}
