package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수 문자, escape 문자 (= escape sequence, escape Character, special Character)
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n 줄바꿈
        System.out.println("자바가 \n 너무 \n 재밌어요"); //문자열의 줄바꿈 \ㅜ

        // \t Tap 효과를 주는 특수문자
        //해물파전 9000원
        //김치전 8000원
        //부추전 8000원
        System.out.println("해물파전 \t 9000원");
        System.out.println("김치전 \t 8000원");
        System.out.println("부추전 \t 8000원");

        System.out.println("C:\\Program Files\\Java"); //역슬래쉬를 문자열로 인식하게 하기 위해서는 \\ 두번

        //담비가 "야옹" 이라고 했어요
        System.out.println("담비가 \"야옹 \" 이라고 했어요"); // 문자열 사이에서 큰 따움표를 사용 하고 싶을때는 \ 사용

        // \' : 작은 따움표
        // 하나의 문자열을 저장 => char 'c'
        System.out.println("담비가 \'뭘 봐?\' 라는 표정을 지었어요"); // \가 없어도 큰 상관은 없다.
        System.out.println("담비가 '뭘 봐?' 라는 표정을 지었어요"); // \가 없어도 큰 상관은 없다.

        char c = 'A';
        c= '\'';
        System.out.println(c);
    }
}
