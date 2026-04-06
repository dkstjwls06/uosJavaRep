package ch05;

import java.util.Scanner;

class Movie{
    String title, director;
    static int count;
    public Movie(String title, String director){
        this.title = title;
        this.director = director;
        count++;
    }

}

public class MovieArrayTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Movie[] list = new Movie[10]; // 이건 생성자 부른거 아니다!!!
        list[0] = new Movie("백투터퓨쳐","로버트 저메키스");
        list[1] = new Movie("티파니에서 아침을", "에드워드 블레이크");
        // 생성자 : new Movie() Syntax;;;;;;;; - 2개 만든거.
        for(int i=0; i<Movie.count; i++){
            System.out.print("(제목: "+list[i].title);
            System.out.println(", 감독: "+list[i].director + ")");
        }
    }

}
