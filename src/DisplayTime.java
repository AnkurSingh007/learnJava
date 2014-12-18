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
public class DisplayTime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer for Seconds: ");
        int seconds = input.nextInt();
        int minutes = seconds / 60;
        int remainingseconds = seconds -  minutes * 60;
        double power = Math.pow(2, 3);
        System.out.println("Minutes are " + minutes + " Seconds are " + remainingseconds);
        System.out.println("Testing power " + power);
}
}