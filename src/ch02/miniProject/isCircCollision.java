package ch02.miniProject;

import java.util.Scanner;

public class isCircCollision {
    public static void main(String[] args){
        int x, y, r, x1, y1;
//      int h = sc.nextInt(), k = sc.nextInt(), r = sc.nextInt(); ...... 이런 식으로!
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 중심(x,y) 좌표와 반지름을 입력하세요: ");
        x= sc.nextInt();
        y = sc.nextInt();
        r = sc.nextInt();
        System.out.print("점의 (x,y) 좌표와 반지름을 입력하세요: ");
        x1= sc.nextInt();
        y1 = sc.nextInt();
        if(Math.pow((x-x1),2) + Math.pow((y-y1),2) <= Math.pow(r,2)){
            System.out.printf("점 (%d, %d)는 원 위에 있습니다.\n", x1, y1);
        } else {
            System.out.printf("점 (%d, %d)는 원 위에 있지 않습니다.\n", x1, y1);
        }
    }
}
