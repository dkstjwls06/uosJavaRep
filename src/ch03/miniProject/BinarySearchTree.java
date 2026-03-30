package ch03.miniProject;

import java.util.Scanner;


public class BinarySearchTree {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while(true){
            System.out.print("정답을 추측하여 보시오: ");
            int guess = sc.nextInt();
            cnt++;
            if (guess == num) {
                System.out.printf("축하합니다. 시도 횟수 = %d", cnt);
                return;
            }
            if (guess>num) System.out.println("제시한 정수가 높습니다.") ;
            else System.out.println("제시한 정수가 낮습니다.");

        }
    }
}
