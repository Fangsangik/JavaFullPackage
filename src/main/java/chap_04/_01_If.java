package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //조건문 If
        int hour = 10; //오전 10시

        /*
        if (조건) {
            ... 수행할 명령 ...
            }
         */

        if (hour <14) {
            System.out.println("아이스 아메리카노 +1");
            System.out.println("샷 추가");
        }
        System.out.println("커피주문 완료 ");
        // hour = 15 일때 출력값
        // 샷 추가
        // 커피주문 완료
        // 중괄호 설정을 해주어야 출력값 -> 커피 주문 완료

        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        hour = 10;
        boolean moringCoffee = false;
        //if (hour < 14 && moringCoffee == false){
        if (hour < 14 && !moringCoffee){
            System.out.println("아이스아메리카노 + 1");
        }
        System.out.println("커피 주문 완료");

        //오후 2시 이후 이거나, 모닝 커피를 마신 경우?
        hour = 15;
        moringCoffee = true;
       //if (hour > 14 || moringCoffee == true){
        if (hour > 14 || moringCoffee){
            System.out.println("디카페인 주문 + 1");
        }
        System.out.println("커피 주문 완료");
    }
}
