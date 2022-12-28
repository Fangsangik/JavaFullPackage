package chap_03;

/*
주민등록번호에서 생년월일 및 성별까지만 출력

주민등록번호는 13자리 숫자로 구성
앞 6자리는 생년월일 정보, 뒷 7자리는 중 첫번째 숫자는 성별 정보
입력데이터는 -을 포함한 14자리 문자열

예시
"901231-1234567"인 경우 901231-1까지 출력
 */

public class Practice03 {
    public static void main(String[] args) {
        String a = "901231-1234567";
        String b = "030708-4567890";

        System.out.println(a.substring(0, 8));
        System.out.println(a.substring(0, a.indexOf("-") + 2)); //0위치 부터 하이픈 위치 + 2 까지

        System.out.println(a.substring(0, a.lastIndexOf("2")));
        System.out.println(b.substring(0, b.lastIndexOf("5")));

    }
}
