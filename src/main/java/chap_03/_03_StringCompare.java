package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); //문자열 내용이 동일하면 True, 다르면 False
        System.out.println(s1.equals("Java")); //문자열 내용이 동일하면 True, 다르면 False
        System.out.println(s2.equals("python")); //대소문자 구분
        System.out.println(s2.equalsIgnoreCase("python")); //대소문자 구분 없이 내용 동일하면 True

        // 문자열 비교 심화
        s1 = "1234";
        s2 = "1234";

        System.out.println(s1.equals(s2)); //true (내용)
        System.out.println(s1 == s2); //true (참조)
        /*
        1234라는 값을 s1과 s2가 참조, 동일한 값을 인식하게 끔 놔둔다.
         */

        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2)); //true
        System.out.println(s1 == s2); //false
        /*
        s1 = new String("1234");
        s2 = new String("1234");
        둘 참조의 값이 다르다. 서로 다른 곳을 참조 하는 것.

        자바에서 내용을 비교 하고 싶다면 equals를 사용
         */

    }
}
