package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */
import java.util.Scanner;
public class BMICalc
{
    public static void main( String[] args )
    {
        float weight, height, bmi;

        Scanner input = new Scanner(System.in);
        System.out.print( "Enter your weight in lbs: " );
        weight = input.nextFloat();
        System.out.print( "Enter your height in inches: " );
        height = input.nextFloat();
        bmi = (weight/(height*height))*703;

        if (bmi >=18.5 && bmi<=25){
            System.out.println("Your BMI is "+String.format("%.1f", bmi)+"."+"\n"+"You are within the ideal weight range.");
        }
        else if (bmi>25){
            System.out.println("Your BMI is "+String.format("%.1f", bmi)+"."+"\n"+"You are overweight. You should see your doctor.");
        }
        else if (bmi>18.5){
            System.out.println("Your BMI is "+String.format("%.1f", bmi)+"."+"\n"+"You are underweight. You should see your doctor.");
        }

    }
}
