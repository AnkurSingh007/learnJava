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
public class FahrenheitToCelcius {
    public static void main(String[] args){
        System.out.println("Enter temperature in Fahrenheit");
        Scanner input = new Scanner(System.in);
        double fahrenheit = input.nextDouble();
        double celcius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Temperature in fahrenheit is " + fahrenheit + " which in celcius is " + celcius);
        
    }
}
