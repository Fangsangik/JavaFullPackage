package chap_02;

public class _01_Operater1 {
    public static void main(String[] args) {
        //산술 연산자

        //일반 연산
        System.out.println(4 + 2);// 6
        System.out.println(4 - 2);// 2
        System.out.println(4 * 2);// 8
        System.out.println(4 / 2);// 2
        System.out.println(4 % 2);// 0 나머지 값
        System.out.println(5 % 2);// 1
        System.out.println(5 / 2);// 2.5이지만 정수 나누기 이기에 정수 부분만 2가 값
        System.out.println(2 / 4);// 0

        //우선 순위에 따른 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c);

        c = a - b;
        System.out.println(c);

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c);

        // 증감 연선 (++ , --)
        int val = 10;
        System.out.println(val); // 10
//        val++;  val의 연산을 1을 더하고 다른 문장이 수행
//        ++val;  문장에 연산을 먼저 수행 하고 난 뒤 val ++ 값이 형성

        System.out.println(++val); // val에 + 1을 더한 후 문장을 수행
        System.out.println(val); // 11

        val = 10;
        System.out.println(val);
        System.out.println(val++); // val이라는 값을 갖고 문장을 실행 => 10
        System.out.println(val); // val + 1 출력

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // --val 수행 후 문장을 수행 => 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 문장을 수행 한 후
        System.out.println(val); // 다음 줄에서 -1 이 수행 된다.

        //은행 대기 번호 표
        int waiting = 0;
        System.out.println("대기 인원:" + waiting++); // 0
        System.out.println("대기 인원:" + waiting++); // 1
        System.out.println("대기 인원:" + waiting++); // 2
        System.out.println("총 대기 인원:" + waiting); // 3
    }
}
