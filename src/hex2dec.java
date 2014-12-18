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
public class hex2dec {
    static final int BASE = 16;
    public static int convertToDec(String str){
            int number = 0;
             int length = str.length();
             for(int i = length - 1, j = 0; i >= 0; --i, ++j){
                 number += Integer.parseInt(str) * Math.pow(BASE, j);
             }
             return number;
    }
    public static void main(String[] args){
        System.out.println
    }
}
