package ch06.miniProject;

import java.util.Scanner;

abstract class Sprite {
    int x = 3, y = 3;
    abstract void move(char c);
}
class Main extends Sprite {
    void move(char c) {
        if (c == 'h') --x;
        else if (c == 'j') --y;
        else if (c == 'k') ++y;
        else if (c == 'l') ++x;
    }
}
class Monster extends Sprite {
    public Monster() {
        x = y = 7;
    }
    void move(char c){
        x += (Math.random()-0.5)>0? 1: -1;
        y += (Math.random()-0.5)>0? 1: -1;
    }
}
class Gold extends Sprite {
    public Gold(){
        x = 3;
        y = 6;
    }
    void move(char c){
        // Gold는 움직이지 않는다.
    }
}


public class TextGame {
    public static void main(String[] args){
        char[][] map = {
                {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',},
                {'#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#'},
                {'#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#'},
                {'#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#'},
                {'#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#'},
                {'#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#'},
                {'#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#'},
                {'#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#'},
                {'#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#'},
                {'#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#',},
        };
        Scanner sc = new Scanner(System.in);
        Main mine = new Main();
        Monster monster = new Monster();
        Gold gold = new Gold();

        while(true){
            for(int y=0;y< map.length;y++){
                for(int x=0;x<map[y].length;x++){
                    if(y == monster.y && x == monster.x){
                        System.out.print('M');
                    }
                    else if(y == mine.y && x == mine.x){
                        System.out.print('@');
                    }
                    else if(y == gold.y && x == gold.x){
                        System.out.print('G');
                    }
                    else{
                        System.out.print(map[y][x]);
                    }
                }
                System.out.println();
            }
            System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽(l) :");
            char c = sc.next().charAt(0);
            mine.move(c);
            monster.move(c);
            // gold.move(c);

            if(mine.x == monster.x && mine.y== monster.y){
                System.out.println("몬스터에게 잡혔습니다.");
                return;
            }
            if(mine.x == gold.x && mine.y== gold.y){
                System.out.println("사용자가 이겼습니다.");
                return;
            }
        }
    }
}
