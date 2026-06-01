package ch12;

public class StringBufferExample {
    public static void main(String[] args){
        StringBuffer buffer = new StringBuffer("Hello");

        buffer.append(" World");
        buffer.append('!');
        System.out.println("append: "+buffer);

        buffer.insert(6,"Java ");
        System.out.println("insert: "+buffer);

        buffer.delete(5,10);
        System.out.println("delete: "+buffer);

        buffer.deleteCharAt(5);
        System.out.println("deleteCharAt: "+buffer);

        buffer.replace(5,10," Java");
        System.out.println("replace: "+buffer);

        buffer.reverse();

        System.out.println("reverse: "+buffer);
    }
}
