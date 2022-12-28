package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        //형 변환 TypeCasting
        //정수형 -> 실수형
        //실수형 -> 정수형

        //int score = 93 + 95.8; => 정수형 데이터와 실수형 데이터를 서로 더하려고 할때 error 발생

        //int to float, double
        int score = 93;
        System.out.println(score); //93
        System.out.println((float) score); //93.0
        System.out.println((double) score); //93.0

        //float, double to int
        float score_f = 93.F;
        double score_d = 98.8;
        System.out.println((int)score_f); //93
        System.out.println((int)score_d); //98

        //정수 + 실수 연산
        score = 93 + (int) 98.8; // 93+98
        System.out.println(score);

        score_d =(double)93 + 98.8; //결과가 실수로 들어갈때는 double로 자동으로 들어간다.
        System.out.println(score_d);

        // 변수에 형변환된 데이터 집어넣기
        double csd = score;  // 191 => 191.0
        //int -> long -> float -> double (자동으로 형 변환이 됨)

        int csd1 = (int) score_d;
        //double -> float -> long -> int (casting을 해줘야 한다.)

        // 숫자를 문자열로
        String s1 = String.valueOf(93); // String.valueOf을 사용해서 숫자을 문자열로 변환
        System.out.println(s1);

        //정수를 문자열로
        s1 = Integer.toString(93);
        System.out.println(s1);

        //실수를 문자열로
        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2);

        //문자열을 숫자로
        int i = Integer.parseInt("93"); //문자열을 파싱한다, 93만큼을 꺼내서 정수로 변환 한다.
        System.out.println(i); //93
        double d = Double.parseDouble("98.8");
        System.out.println(d); //98.8

        //int error = Integer.parseInt("Java"); -> 올바른 형식을 넣지 않았을 경우

    }
}
