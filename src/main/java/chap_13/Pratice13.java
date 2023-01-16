package chap_13;

/*
속담 퀴즈 프로그램을 적성하시오

퀴즈내용은 saying.txt라는 이름의 파일로 제공
퀴즈는 문제와 정답이 각가 한줄로 구성
사용자로부터 값을 입력받아 정답여부 확인
오답인 경우 정답 안내
퀴즈 내용이 더이상 없을때 까지 반복

세살 __ 여든까지 간다
버릇

소 잃고 __ 고친다
외양간

천 리 길도 한 __ 부터
걸음
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Pratice13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println(("문제") + "세살 __ 여든까지 간다");
//        String lang = sc.nextLine();
//        System.out.println("정답 입력 =>" + lang);
//        System.out.println("정답입니다.");
//
//        System.out.println(("문제") + "소 잃고 __ 고친다");
//        String lang1 = sc.nextLine();
//        System.out.println("정답 입력 =>" + lang1);
//        System.out.println("정답입니다.");
//
//        System.out.println(("문제") + "천 리 길도 한 __ 부터");
//        String lang2 = sc.nextLine();
//        System.out.println("정답 입력 =>" + lang2);
//        System.out.println("정답입니다.");

        try(BufferedReader br = new BufferedReader(new FileReader("src/chap_13.saying.txt"))){
            System.out.println("속담 퀴즈 입니다. 빈 칸에 알맞은 말을 입력하시오");
            String quize;
            String answer;
            String input;

            while (true){
                quize = br.readLine();
                answer = br.readLine();
                if (quize == null || answer == null) {
                    break;
                }
                System.out.println(("문제") + "세살 __ 여든까지 간다");
                System.out.print("정답 입력 => ");

                input = sc.next();
                if (input.equals(answer)){
                    System.out.println("정답입니다.");
                } else {
                    System.out.println("틀렵습니다 정답은" + answer + "입니다.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
