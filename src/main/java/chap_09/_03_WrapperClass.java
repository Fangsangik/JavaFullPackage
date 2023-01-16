package chap_09;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 (Wrapper) 클레스 (모두 첫 글자 대문자)
        // = 순수하게 값는 갖는 기본 자료형을 객체 형태로 변환
        // int, double, float, char

        Integer i = 123;
        Double d = 1.0;
        Character c = 'A';
        System.out.println(i);
        System.out.println(d);
        System.out.println(c);

        System.out.println("-------------------");

        // 래퍼 클레스는 그냥 클레스 이기에 기능을 제공 가능

        System.out.println(i.intValue());
        System.out.println(d.intValue()); // 실수를 int로 변환
        System.out.println(c.charValue());

        System.out.println("-------------------");
        String s = i.toString(); // 정수를 문자료 변환 -> s에 넣어줌
        System.out.println(s);
    }
}
