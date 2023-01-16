package chap_06;

import org.jetbrains.annotations.NotNull;

public class _08_MainMethod {
    //메인 메소드 영역
    //프로그램이 실행 될때 가장 처음 진입 영역
    public static void main(String @NotNull [] args) {
        for (String s: args) {
            System.out.println(s);
        }

        //1. 도서 조회
        //2. 도서 대출
        //3. 도서 반납
        if (args.length == 1){
            switch (args[0]){
                case "1":
                    System.out.println("도서 조회 메뉴 입니다");
                    break;
                case "2":
                    System.out.println("도서 대출");
                    break;
                case "3":
                    System.out.println("도서 반납");
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
            }
        }else {
            System.out.println("1~3 메뉴중 입력");
        }
    }
}
