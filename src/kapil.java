import java.io.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankur
 */
public class kapil {
    public static void main(String[] args) throws Exception{
        DataInputStream o = new DataInputStream(System.in);
        String a, b;
        a = o.readLine();
        b = a.substring(2, 5);
        System.out.println(b);
    }
}
