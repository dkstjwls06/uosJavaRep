package ch13;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args){
        String text = "apple banana apple cherry banana apple";

        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = text.split(" ");
        for(String word : words){
            wordCount.put(word, wordCount.getOrDefault(word,0)+1);
        }
        System.out.println("단어 빈도수: "+wordCount );
    }
}
