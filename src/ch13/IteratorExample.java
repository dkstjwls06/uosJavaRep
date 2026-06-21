package ch13;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("체리");
        fruits.add("대추");

        Iterator<String> iterator = fruits.iterator();

        System.out.println("Iterator를 사용한 ArrayList 출력:");
        while(iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}
