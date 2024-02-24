package com.example.scientificcalculator;

import java.util.Scanner;

public class ScientificCalculator
{
    public double squareRoot(double num)
    {
        return Math.sqrt(num);
    }
    public int factorial(int num)
    {
        if(num<0)
        {
            throw new IllegalArgumentException("Illegal Argument: Argument is negative");
        }
        int ans = 1;
        for(int i=2;i<=num;i++)
        {
            ans*=i;
        }
        return ans;
    }
    public double logarithm(double num)
    {
        if (num <0) {
            throw new IllegalArgumentException("Illegal Argument: Argument is negative");
        }
        if(num==0)
        {
            throw new IllegalArgumentException("Illegal Argument: Argument is zero");
        }
        return Math.log(num);
    }
    public double expo(double num,double a)
    {
        return Math.pow(num,a);
    }
    public void display()
    {
        Scanner sc= new Scanner(System.in);
        while(true)
        {
            try {
                System.out.println("Menu :: Scientific Calculator\nChoice 1. Square root\nChoice 2. Factorial\nChoice 3. Natural Logarithm(base e)\nChoice 4. Power\nChoice 5.Exit");
                System.out.println("Enter Your Choice");
                int choice = sc.nextInt();
                sc.nextLine();
                if (choice == 1) {
                    System.out.println("Enter the Number to Calculate Square Root:");
                    System.out.println("Square Root of the Number is:" + squareRoot(sc.nextDouble()));
                } else if (choice == 2) {
                    System.out.println("Enter the Number to Calculate Factorial:");
                    System.out.println("Factorial of the Number is:" + factorial(sc.nextInt()));
                } else if (choice == 3) {
                    System.out.println("Enter the Number to Calculate Natural Logarithm:");
                    System.out.println("Natural Logarithm of the Number is:" + logarithm(sc.nextDouble()));
                } else if (choice == 4) {
                    System.out.println("Enter the Number:");
                    double num = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter the Power:");
                    double pow = sc.nextDouble();
                    System.out.println("Power of the Number is:" + expo(num, pow));
                } else {
                    System.out.println("Exit");
                    System.exit(0);
                }
            }
            catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            sc.nextLine(); // Clear the input buffer
        }
        }
    }
}
