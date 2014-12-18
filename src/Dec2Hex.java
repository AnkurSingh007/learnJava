import java.util.Scanner;
//WRONG OUTPUT
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankur
 */
public class Dec2Hex {
    public static void main(String args[]){
        System.out.println("Enter the number in decimal");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        String answer = "";
        while(number > 16){
            int holder = number % 16;
            number = number / 16;
            if(holder > 10)
                answer.concat("A" + (holder - 10));
            else
                answer.concat(holder+"");
           
            
    }
        if(number < 10)
             answer.concat(number + "");
        else
            answer.concat("A" + (number - 10));
        System.out.println(answer);
        
}
}