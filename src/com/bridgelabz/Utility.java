package com.bridgelabz;

public class Utility {
    public static int dayOfWeek(double d, double m, double y){
        double d0,m0,y0,x;
        y0=y-(14-m)/12;
        x=y0+(y0/4)-(y0/100)+(y0/400);
        m0=m+12*((14-m)/12)-2;
        d0 = (d+x+31*m0/12)%7;
        return (int) d0;
    }
    public static double temperatureConversion(double temp, char unit){
        double res=0;
        switch (unit) {
            case 'C':
            case 'c':
                res = 32 +(9/5.0 * temp);
                break;
            case 'F':
            case 'f':
                res = (temp-32)*5.0/9.0;
                break;
            default:
                System.out.println("Invalid input");
        }
        return res;
    }
    public static double monthlyPayment(int P, int Y, int R){
        double payment;
        double r = R/(12.0*100);
        double n =12.0*Y;
        payment = ((double) P*r)/(1.0-Math.pow((1.0+r),(-1.0*n)));
        return payment;
    }

    public static double sqrt(int c){
        double t = c;
        double epsilon = 0.000000000000001;
        while (Math.abs((c/t)-t)>epsilon*t) {
            double avg = (t+(c/t)) * 0.5;
            t = avg;
        }
        return t;
    }
    public static int[] toBinary(int decimal){
        int temp=decimal;
        int tem[] = new int[40];
        int binary[] = new int[40];
        int index = 0;
        while (temp>0){
            tem[index++] = temp%2;
            temp = temp/2;
        }
        int binIndex =0;
        for (int i = index;i>=0;i--){
            binary[binIndex]= tem[i];
            binIndex++;
        }
        for (int i=0;i<binIndex;i++){
            System.out.print(binary[i]);
        }
        System.out.println();
        return binary;
    }
}
