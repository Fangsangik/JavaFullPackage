package chap_02;

public class _04_Operater4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true이면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true 여야 true 하나라도 false면 false

        System.out.println((5 > 3) && (3 > 1)); //두 식이 모두 true이면 true
        System.out.println((5 > 3) && (3 < 1)); //false

        System.out.println((5 > 3) || (3 > 1)); //true 둘중에 하나라도 만족하면 true
        System.out.println((5 > 3) || (3 < 1)); //true 둘중에 하나라도 만족하면 true
        System.out.println((5 < 3) || (3 < 1)); //모두 false

        //System.out.println(3 < 5 < 10 ); -> 연속 3개 비교는 X

        //논리 부정 연산자 (true -> false) / (false -> true)
        System.out.println(!true); // false
        System.out.println(!false); // true

        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true

    }
}
