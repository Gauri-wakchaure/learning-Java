package LoopingStatement;

import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        int count = 0;

        // Loop should check divisors of num
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }

        // FINAL RESULT (outside loop)
        if(count == 2)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not Prime Number");
        }
        
        sc.close();
    }
}
