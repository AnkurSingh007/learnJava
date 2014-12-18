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
public class palindromeCheck {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String inString = input.nextLine();
        boolean isPalindrome = true;
        int endString = inString.length() - 1;
        int numOfLoop = endString / 2;
        for(int i = endString, j = 0; numOfLoop > 0; i--, j++, numOfLoop--){
            if(inString.charAt(j) != inString.charAt(i)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
                System.out.println("Input string is a palindrome");
        else
                System.out.println("Input string is not a palindrome");
        
    }
}
