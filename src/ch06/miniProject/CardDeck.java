package ch06.miniProject;

import java.util.ArrayList;

class Card{
    String suit;
    String rank;
    public Card(String suit, String rank) { this.suit = suit; this.rank = rank; }
    @Override public String toString(){
        return "'"+suit + " " + rank+"'";
    }
}

class Deck{
    ArrayList<Card> deck;
        public Deck(){
            deck = new ArrayList<>();
            String[] shape = {"클럽", "다이아몬드", "하트", "스페이드"};
            String[] num = {"에이스","1","2","3","4","5","6","7","8","9","10","잭","퀸","킹"};


            for(String s : shape){
            for(String n : num){
                deck.add(new Card(s,n));
            }
        }
    }

    @Override public String toString(){
        return deck.toString();
    }
}

public class CardDeck {
    public static void main(String[] args){
        Deck deck = new Deck();
        System.out.println(deck.toString());
    }
}
