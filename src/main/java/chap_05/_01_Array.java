package chap_05;

import java.util.ArrayList;

public class _01_Array {
    public static void main(String[] args) {

        // 배열 : 같은 자료형의 값 여러개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "라때";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + "하나");
        System.out.println(coffeeRachel + "하나");
        System.out.println(coffeeChandler + "하나");
        System.out.println(coffeeMonica + "하나");
        System.out.println("주세요");

         // 배열 선연 첫번째 방법
        String[] coffees = new String[4]; // 크기 4에 해당하는 배열을 만들게 됨
        coffees[0] = "아메리카노"; // index 값을 설정, index 값은 0부터 시작
        coffees[1] = "카페모카";
        coffees[2] = "라때";
        coffees[3] = "카푸치노";

        // 배열 선언 두번째 방법
        String coffees1[] = new String[4];

        // 배열 선언 세번째 방법
        String[] coffees2 = new String[] {"아메리카노", "카페모카", "라때", "카푸치노"};

        // 배열 선언 네번째 방법
        String[] coffees3 = {"아메리카노", "카페모카", "라때", "카푸치노"};
        System.out.println(coffees3[0] + "하나");
        System.out.println(coffees3[1] + "하나");
        coffees3[2] = "에스프레소"; // 변경 값
        System.out.println(coffees3[2] + "하나");
        System.out.println(coffees3[3] + "하나");

        // 다른 자료형
        int [] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;

        double[] d = new double[] {10.0, 11.0, 12.0};
        boolean[] b = new boolean[] {true, true, false};

    }
}
