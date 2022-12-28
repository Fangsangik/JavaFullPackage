package chap_04;

/*
조건문을 활용 해서 주차 요금 정산 프로그램을 잓ㅇ

조건
주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
경차 또는 장애인 차량은 최종 요금에서 50% 할인

주차 요금 예시
일반 차량 5시간 주차시 20000원
경차 5시간 주차시 10000원
장애인 차량 10시간 주차시 15000원
 */

public class Practice04 {
    public static void main(String[] args) {

        int hour = 5;
        boolean smallCar = true;
        boolean disOrder = true;
        int fee = hour * 4000;

        //30000원 초과시 일일 최대 요금으로 수정
        if (fee > 30000){
            fee = 30000;
        }

        if (smallCar || disOrder) {
            fee /= 2;
        }

        //실행결과 출력
        System.out.println("주차요금은" + fee + "원 입니다.");

    }
}
