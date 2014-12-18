/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Ankur
 */
public class ComputeArea {
    public static void main(String[] args){
        final double PI = 3.14;
        double area;
        Scanner input =  new Scanner(System.in);
        double radius = input.nextDouble();
        area = radius * radius * 3.14159;
        System.out.println("The area for circle of radius " + radius + " is " + area);
    }
}
