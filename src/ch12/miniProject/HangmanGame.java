package ch12.miniProject;

import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] words = {"java","school","student","book"};
        String solution = words[random.nextInt(words.length)];
        StringBuffer answer = new StringBuffer(solution.length());
        answer.repeat("_", solution.length());
        System.out.println("행맨 게임에 오신 것을 환영합니다.");
        int maxAttempts = 7;
        int attemptsLeft = maxAttempts;


        while(attemptsLeft > 0){
            System.out.println("현재 상태: "+answer);
            System.out.println("남은 시도 횟수: "+attemptsLeft);
            System.out.print("글자를 추측하시오: ");
            String guess = sc.nextLine().toLowerCase();
            if(guess.length()>1) continue;
            if(solution.contains(guess)){
                System.out.println("맞았습니다!");
                for(int i=0;i<solution.length();i++){
                    char ch = guess.charAt(0);
                    if(solution.charAt(i) == ch) answer.setCharAt(i,ch);
                }

            } else {
                System.out.println("틀렸습니다!");
               attemptsLeft--;
            }

            if(answer.toString().equals(solution)){
                System.out.println("축하합니다! 정답은 "+solution+"였습니다.");
                sc.close();
                return;
            }

        }
        System.out.println("실패. 정답은 "+solution+"였습니다.");

    }
}
