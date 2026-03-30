package ch03.miniProject;

import java.util.HashSet;
import java.util.Set;

public class GenLottery {
    public static void main(){
        Set<Integer> list = new HashSet<>();
        while(true){
            if(list.size() == 6) break;
            int queue = (int)(Math.random() * 45 + 1);
            list.add(queue);
        }
        System.out.println(list.toString());
    }
}
