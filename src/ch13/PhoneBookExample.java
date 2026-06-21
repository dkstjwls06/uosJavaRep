package ch13;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookExample {
    public static void main(String[] args){
        Map<String, String > phoneBook = new HashMap<>();

        phoneBook.put("Kim","010-123-4567");
        phoneBook.put("Park","010-123-4568");
        phoneBook.put("Lee","010-123-4569");

        System.out.println("=== Phone Book ===");
        for(Map.Entry<String, String> entry: phoneBook.entrySet()){
            System.out.println("이름: "+entry.getKey()+", 전화번호: "+entry.getValue());
        }

        String name = "Kim";
        String phone = phoneBook.get(name);
        System.out.println("\n"+name+"의 전화번호는 "+phone);
    }
}
