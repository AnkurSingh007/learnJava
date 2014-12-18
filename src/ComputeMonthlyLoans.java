import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankur
 */
public class ComputeMonthlyLoans {
    public static void main(String[] args){
        //Inpur requirements are interest rate, loan amount and number of years
        //prompt user to input
        double InterestRate;
        double LoanAmount;
        int NumberOfYears;
        System.out.println("Enter the interest rate");
        Scanner input = new Scanner(System.in);
        InterestRate = input.nextDouble();
        System.out.println("Enter the loan amount");
        LoanAmount = input.nextDouble();
        System.out.println("Enter Number of Years of loan period");
        NumberOfYears = input.nextInt();
        InterestRate /= 12;//Monthly interest rate
        InterestRate /= 100;//Converting into percentage
        double denominator = Math.pow((1 + InterestRate), NumberOfYears * 12);
        double MonthlyPayment = (LoanAmount * InterestRate) / (1 - (1 / denominator));
        System.out.println(" MonthlyPayment is " + MonthlyPayment);
        
    }
}
