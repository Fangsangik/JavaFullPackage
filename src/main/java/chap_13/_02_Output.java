package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        //출력

        //정수(d)
        //System.out.printf("포멧을 지정 한 수" , 값들 지정); = System.out.format()
        //format 부분에 ("%d%n") 입력
        System.out.printf("%d%n" , 1);
        System.out.printf("%d, %d, %d%n", 1,2,3);
        System.out.printf("%6d%n" , 1234); // %6d%n = 6자리 우선 확보 하고 1234 들어간다
        System.out.printf("%06d%n", 1234); // 6자리 확보 한다는 것은 동일 + 빈 공간을 0으로 채우겠다는 것
        System.out.printf("%6d%n", -1234); // 6자리 공간을 확보 하고 -1234가 붙는다.
        System.out.printf("%+6d%n", 1234); // 6자리 공간을 확보 하고 난 뒤 + 가 붙는다.
        System.out.printf("%,15d%n", 1000000000); // 15자리 공간을 확보하고, 3자리 마다 콤마
        System.out.printf("%-6d%n" , 1234); // 6자리 공간을 확보 하고, 왼쪽 정렬

        System.out.println("--------------------");

        //실수 출력 (f)
        System.out.printf("%f%n", Math.PI); // 3.141593
        System.out.printf("%.2f%n", Math.PI) ; // 소수점 2째 짜리 반올림
        System.out.printf("%6.2f%n" , Math.PI);
        System.out.printf("%-6.2f%n", Math.PI);
        System.out.printf("%06.2f%n", Math.PI);
        System.out.printf("%+6.2f%n", Math.PI);
        System.out.printf("%-6.2f%n", Math.PI);

        System.out.println("--------------------");

        //문자열 (s)
        System.out.printf("%s%n", "JAVA"); // 일반 출력
        System.out.printf("%6s%n", "JAVA"); // 6자리 공간 확보 오른쪽 출력
        System.out.printf("%-6s%n", "JAVA"); // 6자리 공간 확보 왼쪽 출력
        System.out.printf("%6.2s%n", "JAVA"); // 전체 문자열 중에서 2글자 까지만 출력
        System.out.printf("%-6.2s%n", "JAVA");

        System.out.println("--------------------");
        //응용
        System.out.println("이름 영어 수학 평균");
        System.out.println("강백호" + 90 + "" + 80 + "" + 85.0);
        System.out.println("서태웅" + 100 + "" + 100 + "" + 100.0);
        System.out.println("채치수" + 95 + "" + 100 + "" + 97.5);

        System.out.println("--------------------");
        //응용 2
        System.out.println("이름       영어    수학    평균");
        System.out.printf("%-6s %4d %4d %6.1f %n", "강백호" , 90 , 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f %n", "서태웅" , 100 , 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f %n", "채치수" , 95 , 100, 97.5);

        System.out.println("--------------------");
        //참고
        //한글 숫자 영어 필요로 하는 크기가 다르다.
        System.out.println("ABCDEFG");
        System.out.println("가나다라마바사");


    }
}
