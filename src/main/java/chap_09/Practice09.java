package chap_09;

/*
ArrayList를 이용하여 학생별 프로그래밍 언어 자격증 취득 정보를 관리
자바 자격증을 보유한 학생 이름 출력

조건
학생 이름 및 자격증 취득 정보를 위한 Student 클래스 생성
학생 1인당 보유 자격증은 1개

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice09 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("유재석", "파이썬"));
        list.add(new Student("박명수", "자바"));
        list.add(new Student("김종국", "자바"));
        list.add(new Student("조세호", "C"));
        list.add(new Student("서장훈", "파이썬"));

        System.out.println("자격증을 보유한 학생");
        System.out.println("_________________");
        for (Student s:list) {
            if (s.info.equals("자바")){
                System.out.println(s.name);
            }
        }

    }
}

class Student{
    String name;
    String info;

    public Student(String name, String info) {
        this.name = name;
        this.info = info;
    }
}
