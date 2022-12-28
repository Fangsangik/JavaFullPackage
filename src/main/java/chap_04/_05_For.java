package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For

        // 매장 이름 : 나코 매장
        System.out.println("어서오세요 나코입니다");

        // 또 다른 손님이 등장
        System.out.println("어서오세요 나코입니다");
        System.out.println("어서오세요 나코입니다");
        System.out.println("어서오세요 나코입니다");

        //인사 방식이 바뀜
        System.out.println("환영합니다 나코입니다");
        System.out.println("환영합니다 나코입니다");
        System.out.println("환영합니다 나코입니다");

        //매장 이름 바뀜
        System.out.println("환영합니다 코나입니다");
        System.out.println("환영합니다 코나입니다");
        System.out.println("환영합니다 코나입니다");

        //반복문 사용
        /*
        for (선언 (int i = 0;) 조건 (i<10;) 증감 (i++)) {
            .. 수행할 문장 .. // 수행할 문장을 수행 한 후 증감 영역을 들어온다
            }
        // for 라는 반복문을 사용해서 정의 되어 있는 조건을 갖고
        // 정의 되어있는 반복횟수 만큼 괄호 속에 있는 값을 반복
         */

        for (int i=0; i<10; i++){
            //System.out.println("어서오세요 나코 입니다" + i);
            System.out.println("환영합니다 나코 입니다." + i);
        }

        //for 문 응용 (fori + enter)
        //짝수만 출력
        for (int i = 0; i <10; i+=2) {
            System.out.print(i);
        }

        System.out.println();

        //홀수만 출력
        for (int i = 1; i <10; i+=2) {
            System.out.print(i);
        }

        System.out.println();

        //거꾸로 숫자 출력
        //5, 4, 3, 2, 1
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        System.out.println();

        //1부터 10까지 수들의 합
        //1 + 2 + ... + 10
        int sum = 0;
        for (int i=1; i <= 10; i++) {
            sum+=i;
            //처음에 i = 1 일때는 sum = 1이 될 것 이고,
            //i = 2가 되면 sum 1+2 = 3
            System.out.println("현재까지 총합은" + sum + "입니다");
        }
        System.out.println("1부터 10까지의 모든 수의 총 합은" + sum + "입니다");


    }
}
