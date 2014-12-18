import java.util.Scanner;
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankur
 */
public class createRandomCharacters {
    public static void main(String[] args){
        
    }
    public static char[] createArray(){
        System.out.println("Enter the size of the array");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        char[] outputarray = new char[size];
        return outputarray;
    }
    public static int[] RandomCharGeneration(){
            char[] arr  = createArray();
            for(int i = 0; i < arr.length; ++i){
                arr[i] = RandomCharacter.getRandomLowerCaseLetter();
            }
            return arr;
    }
