package chap_06;

public class _04_ParameterAndReturn {
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPowerByExp(int number1, int number2) {
        int result2 = 1;
        for (int i = 0; i < number2; i++) {
            result2 *= number1;
        }
        return result2;
    }

    public static void main(String[] args) {
        //전달 값과 반환 값이 함께 있는 메소드
        int returnValue = getPower(2); //반환 값을 받기 위한 변수가 필요
        System.out.println(returnValue);

        returnValue =getPower(3);
        System.out.println(returnValue);

        int powerByExp = getPowerByExp(3, 5);
        System.out.println(powerByExp);
    }
}
