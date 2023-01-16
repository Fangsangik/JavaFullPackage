package chap_06;

public class _06_WhenToUse {

    public static int getPower(int Num){
        return getPower(Num, 2);
    }

    public static int getPower(int num1, int num2) { // num2 = 반복 횟수
        int result = 1;
        for (int i = 0; i < num2; i++) {
            result *= num1;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유
        // 코드의 중복을 줄일 수 있다. & 코드 유지 보수 할때 유용

        // 2의 2승 구하기
        System.out.println(getPower(2, 2));

        //3의 3승
        System.out.println(getPower(3,3));

        //4의 2승
        System.out.println(getPower(4,2));
    }
}
