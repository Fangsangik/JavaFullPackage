package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees3 = {"아메리카노", "카페모카", "라때", "카푸치노"};

        //for 반복문 이용 해서 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees3[i] + "하나");
        }
        System.out.println("주세요");

        //배열의 길이를 이용한 순회
        for (int i = 0; i < coffees3.length; i++) {
            System.out.println(coffees3[i] + "하나");
        }
        System.out.println("주세요");

        // enhanced for (for-each) 반복문
        for (String coffee : coffees3){
            // coffees3에 있는 값들을 순회 하는데 순회하는 값을 coffee로 받아서 순회
            System.out.println(coffee + "하나");
        }
        System.out.println("주십쇼");
    }
}
