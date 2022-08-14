/*
Write a Util Static Function to calculate monthlyPayment that reads in three
command-line arguments P, Y, and R and calculates the monthly payments you
would have to make over Y years to pay off a P principal loan amount at R per cent
interest compounded monthly.
*/

package com.bridgelabz;

public class MonthlyPayment {
    public static void main(String[] args) {
        int p,y,r;
        double payment;
        p = Integer.parseInt(args[0]);
        r = Integer.parseInt(args[1]);
        y = Integer.parseInt(args[2]);
        payment = Utility.monthlyPayment(p,y,r);
        System.out.println("The monthly Payment is : "+payment);
    }
}
