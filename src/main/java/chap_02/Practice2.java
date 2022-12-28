package chap_02;

/*
어린이 키에 따른 놀이기구 탑승 가능 여부를 확인

조건
120 cm 이상인 경우에만 탑승 가능
삼항 연산자 사용

실행 결과
키가 115cm 이므로 탑승 불가
키가 121cm 이므로 탑승 가능
 */

public class Practice2 {
    public static void main(String[] args) {
        int kid = 115;
        int kid2 = 121;

        if (kid < 120) {
            System.out.println("키가" + kid + "cm 이므로 탑승 불가");
        } else if (kid2 < 120) {
            System.out.println("키가" + kid2 + "cm 이므로 탑승 불가");
        }
        System.out.println("키가" + kid2 + "cm 이므로 탑승 가능합니다.");

        int a = 115;
        int b = 121;
        String height = (a>= 120) ? "키가" + a + "cm 이므로 탑승 가능합니다" : "키가" + a + "cm 이므로 탑승 불가능합니다";
        String height1 = (b>= 120) ? "키가" + b + "cm 이므로 탑승 가능합니다" : "키가" + b + "cm 이므로 탑승 불가능합니다";
        System.out.println(height1);
        System.out.println(height);

    }
}
