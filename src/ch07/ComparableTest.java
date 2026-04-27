package ch07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score){
        this.name=name;
        this.score = score;
    }

    @Override
    public int compareTo(Student other){
        return other.score - this.score;
    }
    @Override
    public String toString(){
        return "Student{score="+score+"}";
    }
}

public class ComparableTest {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Kim",85));
        students.add(new Student("Park",95));
        students.add(new Student("Lee",82));
        students.add(new Student("Choi",91));
        System.out.println("정렬 전: "+students);
        Collections.sort(students);
        System.out.println("정렬 후: "+students);

    }
}
