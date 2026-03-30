package ch01;

public class Programming2 {
    public static void main(String[] args){
        for(int i=0;i<3;i++){
            for(int j=3-i-1;j>0;j--) System.out.print(" ");
            for(int j=0;j<1+2*i;j++) System.out.print("*");
            System.out.println();
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<i+1;j++) System.out.print(" ");
            for(int j=3-i*2;j>0;j--) System.out.print("*");
            System.out.println();
        }
    }
}
