package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        // LinkedList
        // 사람들이 양 옆으로 손을 잡고 있음, 중간에 한명이 들어간다면
        // 중간에 손을 놓고 중간에 새로운 사람을 낑김

        LinkedList<String> list = new LinkedList<>();

        //데이터 추가
        list.add("황상익");
        list.add("루키");
        list.add("박주연");
        list.add("유재석");
        list.add("강호동");

        //데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println("_______________");

        //추가
        list.addFirst("김종국");
        list.addLast("이광수");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("_______________");

        System.out.println("학생 추가 전 :" + list.get(1));
        list.add(1, "송지효");
        //김종국과 황상익 사이에다가 송지효를 추가 하게 됨
        System.out.println(list.get(1));
        System.out.println("학생 추가 후 :" + list.get(1));
        System.out.println("학생 추가 후 :" + list.get(2));

        System.out.println("_______________");

        //삭제
        System.out.println("남은 학생 수(제외 전) :" + list.size());
        list.removeFirst(); // 첫 데이터
        list.removeLast(); // 마지막 데이터
        System.out.println("남은 학생 수(제외 후) :" + list.size());
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("_________________");
        // 변경
        list.set(0, "수지");
        System.out.println(list.get(0));

        System.out.println("_________________");
        //확인
        System.out.println(list.indexOf("김종국"));
        if (list.contains("김종국")) {
            System.out.println("수강 신청 성공");
        } else {
            System.out.println("수강 신청 실패");
        }

        System.out.println("_________________");
        //전체 삭제
        list.clear();
        if (list.isEmpty()) {
            System.out.println("학생 수: " + list.size());
            System.out.println("리스트가 비었습니다.");
        }

        System.out.println("_________________");
        //새로운 학기
        list.add("황상익");
        list.add("루키");
        list.add("박주연");
        list.add("유재석");
        list.add("강호동");

        Collections.sort(list); // 정렬
        for (String s:list) {
            System.out.println(s);
        }
    }
}
