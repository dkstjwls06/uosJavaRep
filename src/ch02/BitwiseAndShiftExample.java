package ch02;

public class BitwiseAndShiftExample {
    public static void main(String[] args){
        int a = 5;
        int b = 3;

        System.out.println("a: "+a+" ("+Integer.toBinaryString(a)+")");
        System.out.println("b: "+b+" ("+Integer.toBinaryString(b)+")");

        int r1 = a&b;
        System.out.println("a & b: "+r1+" ("+Integer.toBinaryString(r1)+")");
        int r2 = a|b;
        System.out.println("a | b: "+r2+" ("+Integer.toBinaryString(r2)+")");
        int r3 = a^b;
        System.out.println("a ^ b: "+r3+" ("+Integer.toBinaryString(r3)+")");
        int r4 = ~a;
        System.out.println("~a: "+r4+" ("+Integer.toBinaryString(r4)+")");
        int r5 = a<<1;
        System.out.println("a<<1: "+r5+" ("+Integer.toBinaryString(r5)+")");
        int r6 = a>>1;
        System.out.println("~a: "+r6+" ("+Integer.toBinaryString(r6)+")");
        int r7 = a>>>1;
        System.out.println("~a: "+r7+" ("+Integer.toBinaryString(r7)+")");

    }
}
