import java.util.Scanner;
import java.util.Arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankur
 */
public class printDistinct {
    public static  void main(String [] args){
        int[] arr = takeInput();
        System.out.println(arr.length);
        printDistinctProc(arr); 
    }
    public static int[] takeInput(){
        System.out.println("Enter the number of elements that you want to enter");
        Scanner input = new Scanner(System.in);
        int numInput = input.nextInt();
        int[] arr = new int[numInput];
        System.out.println("Start entering the numbers");
        for(int i = 0; i < numInput; i++){
            arr[i] = input.nextInt();
        }
        return arr;
    }
    public static void printDistinctProc(int[] arr){
        int[] repeatedNumbers = new int[arr.length];
        int[] frequency = new int[arr.length];
        Arrays.sort(arr);
        repeatedNumbers[0] = arr[0];
        frequency[0] = 1;
        int previous = arr[0];
        int j = 0;
        for(int i = 1; i< arr.length; ++i){
            if(arr[i] == previous){
                frequency[j] += 1;
            }
            else{
                repeatedNumbers[++j] = arr[i];
                frequency[j] = 1;
                previous = arr[i];
            }   
        }
        //printing sorted array
        for(int i = 0; i< arr.length; ++i){
            System.out.print(arr[i] + "\t");
            }
        System.out.print("\n");
        //printing frequency
         System.out.println(" Frequency vector is ");
         for(int i = 0; i < j; ++i)
             System.out.print(frequency[i] + "\t");
         System.out.print("\n");
        //Printing numbers
        for(int i = 0; i < j+1; ++i){
            System.out.print(repeatedNumbers[i]);
            System.out.println(" Its frequency is "+frequency[i]);
            }
        }
    }

