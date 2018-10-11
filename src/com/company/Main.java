package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //print out converted number

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number in inches");
        int numInInches = keyboard.nextInt();

        System.out.printf("%.2f",convertToCm(numInInches));

    }
    //Write a method to convert inches to cm
    public static double convertToCm(int numInInches) //input needed
    {
        double cm = numInInches * 2.54;
        return cm;
    }


}
