package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        //조건문 If Else
        int hour = 10;
        if (hour < 14) {
            System.out.println("아이스아메리카노 + 1");
        }else { // 그 외의 경우 이면
            System.out.println("디카페인 + 1");
        }
        System.out.println("커피주문 완료");

        //오후 2시 이후 이거나, 모닝 커피를 마신경우?
        hour = 15;
        boolean morningCoffee = true;
        if (hour > 14 || morningCoffee) {
            System.out.println("디카페인 + 1");
        }else{
            System.out.println("아이스아메리카노 + 1");
        }
        System.out.println("커피주문 완료");
    }
}
