package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter krwConverter = new KRWConverter();
        //krwConverter.convert(2);

        //convertUSD라는 메소드를 호출 하는 것은 동일
        //전달하는 값은 2개를 주는 형태 하나는 convertible, 하나는 USD
        //람다식에서 USD가 정의 되고 있기 때문에 Convertible convertible값이 람다식으로 정의 하고 있는 것
        //메소드 부분을 변수처럼 전달 하는 것
        // convertUSD((USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + "원") ,1);

        //함수형 인터페이스
        //클레스 내에서 기능 하는 것 = 메소드, 클레스 밖에서 기능 하는것 = 함수
        //함수형 인터페이스를 이용하기 위해서는 인터페이스에는 하나의 추상 메소드가 존재 해야 하는 조건
        //1:1로 정의 되고 있기 때문이다.

        Convertible convertible = (USD) -> System.out.println(USD + " 달러 = " + (USD * 1400) + "원");
        convertUSD(convertible, 1);

        //전달값이 하나도 없다면?
        //전달값이 없을때는 괄호를 열고 닫고 하면 끝 => 화살표 => 입력할 문장 추가
        ConvertibleWithNoParams c1 = () -> System.out.println("1 달러 = 1400 원");
        c1.convert();

        //두줄 이상 코드 있을 때
        c1 = () -> {
            int USD = 5;
            int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + "원");
        };
        c1.convert();

        //전달 값이 2개인 경우
        ConvertibleWithTwoParams c2 = (d, w) ->
                System.out.println(d + " 달러 = " + (d * w) + "원");

        c2.convert(10, 1400);


    //반환 값이 있는 경우
    ConvertibleWithReturn c3 = (d, w) -> d * w;
    int result = c3.convert(20, 1400); //convert메소드는 반환형이 있는 메소드
        System.out.println("20 달러 = " + result + "원");
}

    public static void convertUSD(Convertible convertible, int USD) {
        convertible.convert(USD);
        //convertible의 convert 메소드를 호출 하는 것
    }
}
