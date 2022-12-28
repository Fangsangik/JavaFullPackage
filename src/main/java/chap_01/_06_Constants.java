package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        /*
        변수는 변하는 수 => 얼마든지 변화 가능
        상수는 한번 정하면 수정 불가능
         */

        final String KR_CONTRY_CODE = "+82"; //국가번호
        //KR_CONTRY_CODE = "+8282"; final + 변수 = 상수
        System.out.println(KR_CONTRY_CODE);

        final double PI = 3.141592;
        final String DATE_OF_BIRTH = "1995-06-05";
        //상수의 경우 대문자로 작성

    }
}
