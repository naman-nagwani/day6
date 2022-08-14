/*
To the Util Class add temperatureConversion static function, given the temperature
in fahrenheit as input outputs the temperature in Celsius or vice versa using the
formula
Celsius to Fahrenheit: (°C × 9/5) + 32 = °F
Fahrenheit to Celsius: (°F − 32) x 5/9 = °C
*/

package com.bridgelabz;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        double c,f,result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius");
        c = scan.nextDouble();
        result = Utility.temperatureConversion(c, 'C');
        System.out.println("Temperature in Fahrenheit is : "+result);
        System.out.println("Enter temperature in Fahrenheit");
        f = scan.nextDouble();
        result = Utility.temperatureConversion(f, 'F');
        System.out.println("Temperature in Celsius is : " +result);
    }

}
