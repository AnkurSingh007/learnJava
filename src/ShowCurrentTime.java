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
public class ShowCurrentTime {
    public static void main(String[] args){
        long time = System.currentTimeMillis();
        long totalseconds  = time / 1000;
        long currentseconds = totalseconds % 60;
        long totalminutes = totalseconds / 60;
        long currentminutes = totalminutes % 60;
        long totalhours  = totalminutes / 60;
        long currenthours  = totalhours % 24;
        System.out.println("Current time is " + currenthours +":" + currentminutes + ":" + currentseconds );
    }
}
