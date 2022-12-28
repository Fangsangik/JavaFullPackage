package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //문자열 변환

        System.out.println(s.replace(" and", " ,"));
        //바꿔줄 문자 -> 바꾼 문자
        System.out.println(s.substring(7));
        //index 기준 7부터 시작이 되고 이전 내용은 삭제 된다.
        System.out.println(s.substring(s.indexOf("Java")));
        //s에서 Java를 파악하고, 위치 값을 subString에 사용 해서 위치 값으로 부터 값을 잘라냄
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));
        //시작 위치는 Java를 포함 하는데 끝 위치는 이 글자를 포함하지 않고 직전 문자 까지 출력


        //공백을 제거
        s = "        I love Java        ";
        System.out.println(s);
        System.out.println(s.trim());// 불필요한 공백을 제거

        //문자열 결함
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2)); // 문자열을 합쳐주는 것



    }
}
