package ch05.miniProject;

import java.util.ArrayList;
import java.util.Scanner;

class Book{
    String title;
    int score;
    static int count;
    static int max_score=10, min_score=0;

    public Book(String title, int score){
        this.title = title;
        this.score = score;
        count++;
    }
    public String getTitle(){
        return title;
    }
}

public class BookStore {
    static void menu(){
        System.out.println("=============================");
        System.out.println("1. 책 등록\n2. 책 검색\n3. 모든 책 출력\n4. 종료");
        System.out.println("=============================");
        System.out.print("번호를 입력하시오: ");
    }

    public static void main(String[] args){
        ArrayList<Book> bookArrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Mini Project 수행하기: 책 정보 저장");
        while(true){
            menu();
            int op = sc.nextInt();
            sc.nextLine();
            switch(op){
                case 1:
                    System.out.print("제목: ");
                    String title = sc.nextLine();
                    System.out.print("평점: ");
                    int score = sc.nextInt();
                    if(score>Book.max_score){
                        score = Book.max_score;
                    } else if (score < Book.min_score) {
                        score = Book.min_score;
                    }
                    bookArrayList.add(new Book(title, score));
                    break;
                case 2:
                    System.out.print("인덱스: ");
                    int idx = sc.nextInt();
                    try{
                        System.out.println("제목: "+bookArrayList.get(idx).title+"\n평점: "+bookArrayList.get(idx).score);
                    }catch (IndexOutOfBoundsException e){
                        System.out.println("List Out of Bound.");
                    }
                    break;
                case 3:
                    for(Book book : bookArrayList){
                        System.out.println("제목: "+book.title+"\n평점: "+book.score);
                    }
                    break;
                case 4:
                    return;
            }
        }
    }
}
