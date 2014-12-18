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
public class DeckOfCards {
    public  static void main(String [] args){
        int[] deck  = new int[52];
        String[] shuffle_suit = new String[52];
        String[] shuffle_rank = new String[52];
        String[] suits = { "Spades", "Hearts", "Diamonds", "Clubs"};
        String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        for(int i = 0 ; i< 52; ++i){
            deck[i] = i + 1;
        }
        for(int i = 0; i < 52; ++i){
            int index = (int)(Math.random() * 52);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
            shuffle_suit[i] = suits[deck[i] / 13 ];
            shuffle_rank[i] = rank[deck[i] % 13];
        }
        //print first 5 cards
        for(int i = 0; i < 5; ++i){
            System.out.println(shuffle_suit[i]);
            System.out.println(shuffle_rank[i]);
        }
    }
}
