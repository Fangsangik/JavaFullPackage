package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (폴더 구조)
        // 서로 연관된 클레스들 끼리 묶어주는 일

        // 랜덤 클래스 사용
        Random random = new Random();
        System.out.println("랜덤 정수 :" + random.nextInt()); // 정수형 값을 반환
        System.out.println("랜덤 정수 범위 : " + random.nextInt(10)); // 0이상 10 미만의 정수형
        System.out.println("랜덤 실수 :" + random.nextDouble());// 실수형 값을 반환 0.0이상 1.0 미만
        //System.out.println("랜덤 실수 범위:" + random.nextDouble(10.0));
        // -> nextDouble의 경우 범위를 지정 할 수 없다.

        //만약 5.0 이상 10.0 미만의 실수 도출?
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 범위 :" + (min + (max - min) * random.nextDouble()));

        System.out.println("랜덤 boolean :" + random.nextBoolean());

        //로또 번호를 랜덤으로 뽑으려면 1~45
        System.out.println("로또 번호 :" + (random.nextInt(45) + 1));
        //nextint(45) -> 0이상 45 미만
        //nextint(45) + 1 -> 1이상 46 미만

        //Math(수학 관련), Scanner(사용자로 부터 입력을 받아옴),
        //StringBuilder, StringBuffer, StringTokenizer -> 문자열 관련
        //BigInteger (큰수 관련), BigDecimal (오차 관련)
        //LocalDate, LocalTime, LocalDateTime, DateTimeFormatter .... (날짜 관련)
    }
}
