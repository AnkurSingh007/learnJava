/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankur
 */
public class arraycopy {
        public static void main(String[] args){
            int[] arr1 = {12, 23, 32};
            int[] arr2 = new int[3];
            System.arraycopy(arr1, 0, arr2, 0, 3);
            for(int i= 0; i < 3; i++){
                System.out.println(arr2[i]);
            }
            
      }
}
