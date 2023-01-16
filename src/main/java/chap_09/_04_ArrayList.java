package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임원크
        // (많은 데이터를 편리하고, 보다 쉽게 관리) => 클레스들의 모음
        // 배열과는 다르게 데이터를 추가하거나, 추가된 데이터를 삭제 가능
        // 컬렉션 프레임워크 -> List, Set, Map
        //List -> ArrayList, LinkedList

//        int [] array = new int[3];
//        array[0] = 1;
//        array[2] = 2;
//        array[3] = 3;
        // if -> 이 배열에 추가로 더 넣고 싶다면?
        //배열의 경우 크기가 고정이 되기 때문에 새로운 배열을 만들고,
        //데이터를 모두 옮기는 복사하는 과정
        //리스트는 중복 데이터를 적용

        //ArrayList
        //여러명이 앉아 있는데 중간에 한명이 앉으려고 하면, 그 사람 위치로 부터 모든 사람들이 일어서서,
        //한칸 씩 옆으로 이동 해서 앉음
        ArrayList<String> list = new ArrayList<>();

        //데이터 추가
        list.add("황상익");
        list.add("루키");
        list.add("박주연");
        list.add("유재석");
        list.add("강호동");

        //데이터 조회 (인덱스.get)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println("-------------------");

        //데이터 삭제 (인덱스.remove)
        System.out.println("신청 학생 수 (이사 전)" + list.size());
        list.remove("황상익"); //Object 값
        System.out.println("신청 학생 수 (이사 후)" + list.size());

        System.out.println(list.get(0));

        System.out.println("-------------------");

        System.out.println("남은 학생 수(제외 전)" + list.size());
        list.remove(list.size() - 1); //index 값 (마지막 리스트 값 제거)
        System.out.println("남은 학생 수(제외 후)" + list.size());

        System.out.println("-------------------");
        //순회
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("-------------------");
        //변경 (수강권 양도)
        //list.set() -> 어떤 위치의 인덱스 값을 변경할지 값 2개
        System.out.println("수강권 양도 전 :" + list.get(0));
        list.set(0, "이수근");
        System.out.println("수강권 양도 후 :" + list.get(0));

        System.out.println("-------------------");
        //확인
        //몇번쨰 위치하는지 확인 list.indexOf()
        System.out.println(list.indexOf("유재석"));

        System.out.println("-------------------");
        //포함 여부
        //list.contains
        if (list.contains("이수근")) {
            System.out.println("수강신청 성공");
        } else {
            System.out.println("수강신청 실패");
        }

        System.out.println("-------------------");
        // 전체 삭제
        // list.clear
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수: " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("-------------------");

        // 다음학기에 새로 공부 시작
        list.add("황상익");
        list.add("루키");
        list.add("박주연");
        list.add("유재석");
        list.add("강호동");

        // 졍렬
        Collections.sort(list);
        for (String s:list) {
            System.out.println(s);
        }
    }
}
