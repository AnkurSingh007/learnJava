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
public class SelectionSort {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int numOfInput = input.nextInt();
        int[] arr = new int[numOfInput];//wastfull allocation no requirement.
        System.out.println("Enter the array to be sorted");
       takeInput(arr);
       SortArray(arr);
       PrintArray(arr);
        
    }
    
    public static void PrintArray(int[] arr){
        for(int i =  0; i< arr.length; ++i){
            System.out.print(arr[i]+"\t");
        }
    }
    
    public static void takeInput(int[] arr){
        Scanner input = new Scanner(System.in);
        for(int i  = 0; i < arr.length; ++i){
            arr[i] = input.nextInt();
        }
    }
    public static void SortArray(int[] arr){
        for(int i = 0; i < arr.length; ++i){
            int max = i;
            for(int j = i; j < arr.length; ++j){
                 if(arr[max] > arr[j]){
                    max = j;
                    }
            }
           int temp;
           temp = arr[i];
           arr[i] = arr[max];
           arr[max] = temp;
        } 
    }
}