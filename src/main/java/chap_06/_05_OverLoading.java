package chap_06;

public class _05_OverLoading {
    public static int getpower(int x) { // "4"
        int result = x * x;
        return result;
    }

    public static int getPower(String strNum){
        int number = Integer.parseInt(strNum);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result1 = 1;
        for (int i = 0; i < exponent; i++) {
            result1 = result1 * number;
        }
        return result1;
    }

    public static void main(String[] args) {
        // 메소드 오버로딩
        // (여러 메소드를 만들어야 할 상황일때 메소드 이름을 동일하게 함)
        // 메소드 오버로딩은 전달값의 타입이 다르거나, 전달값의 개수가 다를때 같은 이름의 메소드를 중복해서 사용 가능

        System.out.println(getpower(3));
        System.out.println(getPower("4"));
        //이름은 동일하지만 전달값이 다른 메소드를 각각 호출 하게 되는 것이다.

        System.out.println(getPower(3,3)); // 전달 값 두개

    }
}
