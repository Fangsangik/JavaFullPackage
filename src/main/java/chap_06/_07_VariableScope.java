package chap_06;

public class _07_VariableScope {
    public static void methodA(){
        //System.out.println(number);
        //메인 영역에서 생성된 변수는 메인 영역에서만 사용 가능
        //다른 영역에서 사용 하고 싶다면 파라미터를 생성해서 사용
    }

    public static void methodB() {
        int rst =1;  // 지역변수(정해진 영역에서만 사용 가능)
    }

    public static void main(String[] args) {
        int number = 3;

        //System.out.println(rst);
        // 메소드 영역에서 활용된 변수는 메인 영역에서 활용 불가

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //System.out.println(i);
        //for 문에서 선언된 i는 for문의 영역 내에서 사용

    }
}
