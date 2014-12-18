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
public class arrayOp {
    public static void main(String[] args){
        //Many programs are written in one main
    
        //ouble[] myList = new double[4];
        //double[] myList2 = {1.2, 2.3, 32.4, 5.6};
        
        //Below is for reading and printing an array
        System.out.println("Enter the length of the array to be built");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] myList = new int[length];
        for(int i = 0; i < length; ++i){
            myList[i] = input.nextInt();
        }
        for(int i = 0; i < length; ++i){
            System.out.print(myList[i]+"\t");
        }
        System.out.println("");
        
        //Below is for random shuffling
       /* System.out.println("after random shuffling the array is ");
        for(int i = 0; i < length; ++i){
            int random = (int)Math.random()*length;
            int temp = myList[i];
            myList[i] = myList[random];
            myList[random] = temp;
        }
        for(int i: myList){
            System.out.print(i +"\t");
        }
        */
        int sum = 0;   
        //below prints number of elements above average
        for(int i: myList){
            sum += i;
        }
        int avg = sum / length;
        for(int i: myList){
            if(i>avg)
                System.out.print(i+"\t");
            
        }
        System.out.println("");
    }
}
