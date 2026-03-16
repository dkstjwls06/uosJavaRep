package ch03.miniProject;

import java.util.Scanner;

public class isDotInRect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("사각형의 좌하단 (x1, y1) 좌표를 입력하세요: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("사각형의 우상단 (x2, y2) 좌표를 입력하세요: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        System.out.print("점 (x, y) 좌표를 입력하세요: ");
        int x = sc.nextInt(), y = sc.nextInt();

        if(x > x1 && x < x2 && y > y1 && y < y2) System.out.printf("점 (%d, %d)은 사각형 내부에 있습니다.\n",x,y);
        else if(x < x1 || y < y1 || x > x2 || y > y2) System.out.printf("점 (%d, %d)은 사각형 외부에 있습니다.\n",x,y);
        else System.out.printf("점 (%d, %d)은 사각형의 경계 위에 있습니다.\n",x,y);
    }
}
