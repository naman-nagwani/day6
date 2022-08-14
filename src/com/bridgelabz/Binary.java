package com.bridgelabz;


public class Binary {
    public static void main(String[] args) {
        int n=106;
        int binary [];
        binary = Utility.toBinary(n);
        for (int i =0;i<4;i++) {
            binary[i]=binary[i]+binary[i+4];
            binary[i+4]=binary[i]-binary[i+4];
            binary[i]=binary[i]-binary[i+4];
        }
        System.out.println("Swapped nibbels ");
        for (int i= 0;i<8;i++){
            System.out.print(binary[i]);
        }
        System.out.println();
        System.out.println("Decimal form of swapped nibbles");
        int decimal=0;
        for (int i=7;i>=0;i--){
            decimal+=Math.pow(2,i);
        }
        System.out.println(decimal);
    }
}
