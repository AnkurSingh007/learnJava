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
public class arrayClass {
    public static void main(String [] args){
        int[] arr = {9, 7, 6, 3, 2, 1};
        int index = Arrays.binarySearch(arr, 6);
        System.out.println(index);
    }
}