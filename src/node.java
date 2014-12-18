import java.io.*;
import java.lang.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankur
 */
public class node {
    float data;
    node next;
    public node(){}
    public node (float a, node b){data = a; next = b;}
    public float second()
    {return next.data;}
    public void pt(){
        node i;
        i = this;
        while(i != null){
            System.out.print(i.data+" ");
            i = i.next;
        }
        System.out.println(" end");
    }
    /*public void insertafter(int x, int y){
        node i, j;
        i = this;
        while(i.data != x){
            i = i.next;
        }
        j = new node();
        j.data = y;
        j.node
    }*/
    public node insertkth(int k, int element){
        node i ;
        i = this;
        if(k == 0){
            node temp = new node();
            temp.data  = element;
            temp.next = this;
            return temp
        }
        else{
            for(int j = 1 ; j < k && k > 0 ; j++){
                 i = i.next;
            }//reached jth element
            node temp = new node();
            temp.data = element;
            temp.next = i.next;
            i.next = temp;
           return this;
        }
    }
    public void exchange(int a){
        node i = this;
        node temp;
        while(int j = 0; j < a - 1; ++j){
            i = i.next;
        }
        temp = i.next.next;
        i.next.next = i.next.next.next;
        temp.next = i.next;
        i.next = temp;
    }   
    public void form(int n)
    {
        node i;
        String a;
        try
        {
            DataInputStream o = new DataInputStream(System.in);
            System.out.print("GIve \"+n+\" more elements ");
            a = o.readLine();
            data = Integer.parseInt(a);
            if(n == 1)
                next = null;
            else
            {
                i = new node();
                i.form(n - 1);
                next = i;
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}

class hari
{
    public static void main(String args[]){
        String a;
        node head, headl;
        int n, x, y;
        float t;
        try{
            DataInputStream o = new DataInputStream(System.in);
            System.out.printf("How many elements the link list has");
            a = o.readLine();
            n  = Integer.parseInt(a);
            head = new node();
            head.form(n);
            head.pt();
            System.out.println("The second element is " + head.second());
            System.out.println("After which number do you want to enter?");
            a = o.readLine();
            x = Integer.parseInt(a);
            System.out.print("What number do you want to interchange?");
            a = o.readLine();
            y = Integer.parseInt(a);
         //   head.insertafter(x, y);
            head = head.exchange(y);
            head.pt();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}