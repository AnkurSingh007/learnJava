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
public class randomGeneration {
    public static void main(String args[]){
        int RandomNumber = (int)(Math.random()*100);
        //System.out.println(RandomNumber);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number between 0 to 100");
        int guess = input.nextInt();
        int maximumGuess = 10;
        while(guess != RandomNumber && maximumGuess > 0){
            if(guess > RandomNumber)
                System.out.println("Your guess is higher, Guess again");
            if(guess < RandomNumber)
                System.out.println("Your guess is lower, Guess again");
            guess = input.nextInt();
            maximumGuess--;
        }
        if(maximumGuess > 0)
            System.out.println("Congratulations! You guessed it correctly");
        else
            System.out.println("Your maximum number of chances has been exhausted");
    }
        
}
