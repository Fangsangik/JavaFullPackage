package chap_03;

import java.util.Locale;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length());

        //대소문자 변환
        System.out.println(s.toUpperCase());

        //소문자 변환
        System.out.println(s.toLowerCase());

        //포함 관계
        System.out.println(s.contains("Java")); // 포함된다면 true
        System.out.println(s.contains("C#")); // 포함 X false
        System.out.println(s.indexOf("Java")); // Java라는 문자 위치 참고로, 문자열의 첫번째 위치가 0이 된다
        System.out.println(s.indexOf("C#")); //  포함되지 않는다면 -1 값을 반환
        System.out.println(s.indexOf("and")); // 처음 위치하는 위치 정보
        System.out.println(s.lastIndexOf("and")); // 마지막으로 위치하는 위치정보 반환

        //시작문구 끝 문구 사용
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작 하면 True, 아니면 False
        System.out.println(s.endsWith(".")); // 이 문자열로 .으로 끝나면 true, 아니면 false


    }
}
