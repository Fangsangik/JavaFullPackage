package chap_01;

/*
변수는 어떤 데이터를 저장하는 공간의 값
변수로 값 일부를 빼서 저장하고 있다가, 저장된 데이터를 갖고 출력을 할 수 있디
 */

public class _03_Variables {
    public static void main(String[] args) {
        String name; // 문자열 변수 선언 (name=변수)
        name = "황상익"; // "=" 가 있으면 오른쪽에 있는 값을 왼쪽에 있는 값에 넣겠다.
        String name1 = "황상익"; // 여러 글자 String의 경우 ""

        int hour;
        hour = 15;
        int hours = 15; //정수형 변수 선언

        System.out.println(name + "님, 배송이" + hour + "시에 시작됩니다");
        System.out.println(name + "님, 배송이 완료되었습니다");

        double score = 90.5;
        char grade = 'A'; // 한글자 char을 사용 하는 경우 '' 사용
        name = "박주연"; // name에 대한 정보 update

        System.out.println(name + "님의 점수는" + score + " 점입니다");
        System.out.println("학점은" + grade + "입니다");

        boolean pass =true; // boolean 형
        System.out.println("이번 시험에 합격 했을까요?" + pass);

        double d = 3.14;
        float f = 3.14f; //float + xf;
        // float의 경우 double 자료형 만큼 큰 또는 정밀한 값을 넣을 수 없다.
        System.out.println(f);
        System.out.println(d);


        double D = 3.14123456789;
        float F = 3.14123456789f;
        System.out.println(D);
        System.out.println(F);
        // 정밀도 차이

       long l = 1000000000000l; //long + xl
       l = 1_000_000_000_000l; // 값이 너무 길면 _ 사용 해도 됨
        //프로그램에서 기본적으로 이런 소수점 없느 정수를 적었을때는, 자동으로 int 형태로 들어간다
        //int 정수 값이 갖을 수 있는 값의 크기는 -21억 ~ +21억 => 초과 하는 값일 경우 long을 사용
        System.out.println(l);



    }
}
