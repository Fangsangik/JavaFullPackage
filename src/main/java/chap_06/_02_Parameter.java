package chap_06;

public class _02_Parameter {

    //전달 값이 있는 메소드
    public static void power(int x) { // x는 파라미터, 매개변수
        int result = x * x;
        System.out.println(x + " 의 2승은 " + result);
    }
    //x라는 정수를 받아서 메소드 내에서 거듭 제곱을 진행

    public static void powerByExp(int number, int exponent){
        int result1 = 1;
        for (int i = 0; i < exponent; i++) {
            result1 = result1 * number;
        }

        System.out.println(number + " 의  " + exponent + " 승은 " +result1);
    }

    public static void main(String[] args) {
        //전달 값(=파라미터)

        //Argument, 인수
        power(2); // 2*2 =4
        power(3);

        powerByExp(2,3); //8
    }
}
