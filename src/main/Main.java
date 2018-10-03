package main;

import static java.lang.Math.abs;

public class Main {
    public static void main (String [] args){
        double a = 15; // число для перевода!!!
        double b;
        double result = 0;
        double n = 0;
        double a2 = a;
        double drob = a % 1;
        double posleZap = (abs(a) - (abs(a) - abs(drob)));

        System.out.println("Possible types:");
        if (a%1 != 0){
            if (a >= 1.4*Math.pow(10, -45) & a <= 3.4 * Math.pow(10, 38)){
                System.out.println("float");
            }
            if (a >= 4.9*Math.pow(10, -324) & a <= 1.8*Math.pow(10, 308)) {
                System.out.println("double");
            }
        }
        if (a%1 == 0) {
            if (a >= -128 & a <= 127) {
                System.out.println("byte");
            }
            if (a >= -32768 & a <= 32767) {
                System.out.println("short");
            }
            if (a >= -2147483648 & a <= 2147483647) {
                System.out.println("int");
            }
            if (a >= -9223372036854775808L & a <= 9223372036854775807L) {
                System.out.println("long");
            }
            if (a >= 1.4*Math.pow(10, -45) & a <= 3.4 * Math.pow(10, 38)){
                System.out.println("float");
            }
            if (a >= 4.9*Math.pow(10, -324) & a <= 1.8*Math.pow(10, 308)) {
                System.out.println("double");
            }
        }

        if (a < 0){
            System.out.print("-");
        }

        for (double num = abs(a)-abs(drob); num > 1;){
            b = num % 2;
            result = result + b * Math.pow(10, n);
            num = (num - b)/2;
            n = n+1;
        }

        result = result + 1 * Math.pow(10, n);
//        System.out.print(result);
        for (int k = -1; k>-8;){
            posleZap = posleZap*2;
            if (posleZap >= 1){
                result = result + 1 * Math.pow(10, k);
            }
            posleZap = posleZap - (posleZap - posleZap%1);
            k = k-1;
        }
        System.out.print(result);

    }
}
