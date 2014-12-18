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
public class GuessBirthday {
    public static void main(String args[]){
        
        String set1 = "1 3 5 7\n"+
                "9 11 13 15\n" +
                "17 19 21 23\n" +
                "25 27 29 31\n";
        String set2 =  "2 3 6 7\n" +
                    "10 11 14 15\n" +
                    "18 19 22 23\n" +
                    "26 27 30 31 \n";
        String set3 = "4 5 6 7\n"+
                "12 13 14 15 \n" +
                "24 25 26 27\n" +
                "28 29 30 31\n" ;
        String set4 = "8 9 10 11\n" +
                "12 13 14 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31\n" ;
        String set5 = "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31\n";
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println(set1);
        System.out.println("Is your birthday in set 1?Press Y for yes and N for no");
        String in = input.nextLine();
        if(in == "Y" || in == "y")sum +=1;
        
        System.out.println(set2
        );
        System.out.println("Is your birthday in set 2?Press Y for yes and N for no");
        in = input.nextLine();
        if(in == "Y" || in == "y")sum +=2;
        
        System.out.println(set3);
        System.out.println("Is your birthday in set 3?Press Y for yes and N for no");
        in = input.nextLine();
        if(in == "Y" || in == "y")sum +=4;
        
        System.out.println(set4);
         System.out.println("Is your birthday in set 4?Press Y for yes and N for no");
        in = input.nextLine();
        if(in == "Y" || in == "y")sum +=8;
        
        System.out.println(set5);
         System.out.println("Is your birthday in set 5?Press Y for yes and N for no");
        in = input.nextLine();
        if(in == "Y" || in == "y")sum +=16;
        System.out.println("Your birthday is on " + sum);
        }
}
