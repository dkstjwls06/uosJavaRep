package ch13;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args){
        Vector<String> vector = new Vector<>();

        vector.add("사과");
        vector.add("바나나");
        vector.add("체리");

        System.out.println("벡터 내용: "+vector);
        Collections.sort(vector);
        System.out.println("인덱스 1의 요소: "+vector.get(1));
        vector.remove(1);
        System.out.println("제거 후: "+vector);
        System.out.println("크기: "+vector.size());
        
    }
}
