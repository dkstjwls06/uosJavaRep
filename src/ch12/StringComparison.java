package ch12;

public class StringComparison {
    public static void main(String[] args){
        String str1 = "Hello, World!";
        String str2 = "Hello, World!";

        String str3 = new String("Hello, World!");
        String str4 = new String("Hello, World!");

        System.out.println("리터럴 방식(str1 == str2): "+(str1==str2));
        System.out.println("리터럴 방식(str1.equals(str2)): "+(str1.equals(str2)));



    }
}
