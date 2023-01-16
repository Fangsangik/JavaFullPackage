package chap_13;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) {
        // 입력

        // 사용자 입력
        // Scanner를 사용 하면 파일로 부터 값을 읽어올 수 있고, 사용자로부터 입력을 받을 수 있다.
        Scanner sc = new Scanner(System.in); //사용자로 부터 입력

//        System.out.println("이름을 입력하세요");
//        String name = sc.next(); //사용자로 부터 입력 받아 그 값을 String 형태로 반환
//        //여기서 입력 한 값이 여기서 대기
//
//        System.out.println("혈액형을 입력하세요");
//        String bloodType = sc.next();
//
//        System.out.println("키를 입력하세요");
//        //int tall = Integer.parseInt(sc.next()); // sc.next는 항상 String으로 반환, 형 변환 필요
//        int tall = sc.nextInt(); // 형 변환 필요 없다.
//
//        System.out.println("몸무게를 입력하세요");
//        //double weight = Double.parseDouble(sc.next());
//        double weight = sc.nextDouble();
//
//        System.out.println("혈액형 :" + bloodType);
//        System.out.println("이름 :" + name);
//        System.out.println("키 :" + tall);
//        System.out.println("몸무게 :" + weight);

        System.out.println("무슨 프로그래밍 언어를 배웠나요");
        String lang = sc.next(); // 한 단어를 받을 예정
        //String lang = sc.nextLine(); // 한 단어가 아닌 문장
        System.out.println("언어 :" + lang);

        sc.nextLine(); // 불필요한 문장을 삭제
        /*
        자바를 배웠어요
        언어: 자바를 / 배웠어요 - 삭제
        다음 문장 실행 된다.
         */

        System.out.println("배우고 나니 기분이 어땠나요");
        String feeling = sc.next(); // 재밌었어요
        //String feeling = sc.nextLine() ; // 한 문장
        System.out.println("기분 :" + feeling);

    }
}
