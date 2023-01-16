package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 elseIf

        // 한라봉 에이드 있으면 + 1
        // 또는 망고주스가 있으면 + 1
        // 또는 아이스 아메리카노 +1
        boolean halabongAde = false;
        boolean mangoJuice = true;

        if (halabongAde) {
            System.out.println("한라봉에이드 + 1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피주문 완료");

        //else if는 여러번 사용 가능 => 여러 조건을 확인 하고 싶을때
        halabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;
        if (halabongAde) {
            System.out.println("한라봉에이드 + 1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 +1");
        } else if (orangeJuice) {
            System.out.println("오랜지 주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피주문 완료");


    }
}
