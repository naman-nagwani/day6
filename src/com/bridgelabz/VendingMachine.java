/*
Find the Fewest Notes to be returned for Vending Machine
a. Desc -> There is 1, 2, 5, 10, 50, 100, 500 and 1000 Rs Notes which can be
returned by Vending Machine. Write a Program to calculate the minimum number
of Notes as well as the Notes to be returned by the Vending Machine as a
Change
b. I/P -> read the Change in Rs to be returned by the Vending Machine
c. Logic -> Use Recursion and check for largest value of the Note to return change
to get to the minimum number of Notes.
d. O/P -> Two Outputs - one the number of minimum Note needed to give the
change and second list of Rs Notes that would given in the Change
*/


package com.bridgelabz;

import java.util.Scanner;

public class VendingMachine {
    static int notes []= {1000,500,100,50,10,5,2,1};
    static int index=0;
    static int n=0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int change,temp;
        System.out.println("Enter the change to be returned : ");
        change=scan.nextInt();
        temp=change;
        getCount(temp);
        System.out.println("Total number of notes required is : "+n);
    }

    private static void getCount(int temp) {
        if (temp<notes[index]){
            index++;
            getCount(temp);
        } else {
            int x= temp/notes[index];
            n+=x;
            System.out.println(notes[index] +" * "+x);
            temp = temp-(x*notes[index]);
            if(temp!=0) {
                index++;
                getCount(temp);
            }

        }
    }
}
