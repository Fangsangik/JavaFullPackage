package chap_06;

public class _01_Method {

    //메소드 정의
    public static void sayHello(){
        System.out.println("안녕하세요 메소드 입니다");
    }
    //sayHello 라는 메소드 형성
    //메소드는 동작을 주로 나타냄 -> 동사를 포함해서 형성



    public static void main(String[] args) {
        // 메소드 (= 어떤 기능을 하는 코드들의 묶음)
        // y = x + 3 -> (x + 3)기능 = 함수 == 메소드

        //메소드 호출
        System.out.println("메소드 호출 전");
        sayHello();// 문장이 실행 될때는 메소드 정의로 진입을 함
        System.out.println("메소드 호출 후");
    }
}
