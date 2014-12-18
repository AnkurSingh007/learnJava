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
public class stringpractice {
    public static void main(String args[]){
      String s1 = " Welcome ";
      String s2 = " welcome ";
      boolean isEqual = s1.equals(s2);
      if(isEqual)System.out.println("s1 equals s2");
      else System.out.println("s1 not equal to s2");
      boolean IgnoreCaseEqual = s1.equalsIgnoreCase(s2);
       if(IgnoreCaseEqual)System.out.println("s1 equals s2");
      else System.out.println("s1 not equal to s2");
       int ComparisionResult = s1.compareTo(s2);
       System.out.println(ComparisionResult);
        int ComparisionResultIgnoreCases = s1.compareToIgnoreCase(s2);
       System.out.println(ComparisionResultIgnoreCases);
       boolean b = s1.startsWith("AAA");
       if(b)System.out.println("s1 contains AAA");
       else System.out.println("s1 does not contain AAA");
       boolean c = s1.endsWith("AAA");
       if(c)System.out.println("s1 ends with AAA");
       else System.out.println("s1 does not end with AAA");
       int lengths1 = s1.length();
       System.out.println("Length of the string is "+lengths1);
       char x = s1.charAt(0);
       System.out.println(x);
       String s3 = s1 + s2;
       System.out.println(s3);
       String s4 = s1.substring(1, 5);
       System.out.println(s4);
       String s5 = s1.toLowerCase();
       System.out.println(s5);
               
    }
}
