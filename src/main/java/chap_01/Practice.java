package chap_01;

/*
버스 도착 정보를 출력하는 프로그램
각 정보는 적절한 자료형 변수에 정의
 */

public class Practice {
    public static void main(String[] args) {
        String num = "상암08";
        String num2 = "1234";

        int lastMim = 3;
        int lastMim2 = 5;

        double distance = 1.2;

        System.out.println( num + "버스");
        System.out.println( num2 + "버스");
        System.out.println("약" + lastMim + "분 후 도착");
        System.out.println("약" + lastMim2 + "분 후 도착");
        System.out.println("남은 거리" + distance + "km");


    }
}
