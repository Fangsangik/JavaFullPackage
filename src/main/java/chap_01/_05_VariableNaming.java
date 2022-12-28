package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 저장할 값에 어울리는 이름
        // 밑줄(_), 문자(abc), 숫자(123) 사용 가능 (공백은 사용 불가)
        // 밑줄 또는 문자로 시작 가능
        // 한 단어 또는 2개 이상 단어의 연속
        // 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 예약어는 사용이 불가 (public, static, void, int, double, float ....)

        // 입국신고서 (여행)
        String nationality = "대한민국";
        String firstName = "상익";
        String lastName = "황";
        String dateOfBirth = "1995.06.05";
        String location = "신라호텔";
        String purposeOfVisit = "공부";
        String flightNo = "KE657";
        String _flightNo = "KE657";
        String flight_No_2 = "KE657";
        //String -flight_No_2 ="KE657"; -> 하이푼 사용 X

        int accompany = 2;
        int lengthOfStay = 7;

        String item = "시계";
        String item1 = "가방";
        String item2 = "전자제품";
        //String 3item2 = "전자제품"; -> 변수 앞에 숫자 사용 금지

        // 절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
        //CODE="US"; -> final 사용시 변경 불가


    }
}
