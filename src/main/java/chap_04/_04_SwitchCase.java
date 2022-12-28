package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // SwitchCase

        /*
        1등 : 전액 장학금
        2등 : 반액 장학금
        3등 : 반액 장학금
        그 외 : 장학금 대상 아님
         */

        //If else문 사용
        int ranking = 4;
        if (ranking == 1){
            System.out.println("전액 장학금");
        } else if (ranking == 2) {
            System.out.println("반액 장학금");
        }else if (ranking == 3){
            System.out.println("반액 장학금");
        }else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("지급 완료");

        //SwitchCase문
        /*
        switch (expression){
            case A: .. 수행할 명령 ..
            case B: .. 수행할 명령 ..
            case C: .. 수행할 명령 ..
                break
                ...
            default: .. 수행할 명령 ..
         */

        ranking = 1;
        switch (ranking){
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금"); // 중복 되었다고 나타내줌
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        //switch 내부에 들어가는 값을 가지고 판단
        //모든 케이스에 해당 하지 않는다면 default
        //break 문은 switchcase 문을 탈출하는 용도

        //case 2와 3을 통합
        ranking = 2;
        switch (ranking){
            case 1 :
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                // ranking이 2등과 3등이 되었을때 값을 타고 내려옴
                break;
            default:
                System.out.println("장학금 대상 아님");
        }

        //중고 상품의 등급에 따른 가격을 확정 (1급 : 최상, 2급: 최하)
        int grade =1; // 등급
        int price = 7000; // 기본 가격
        switch (grade){
            case 1:
                price += 1000; // price = price + 1000원
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격:" + price + "원");

        //1 등급일때 break가 없기 때문에 1000++ 된다.
        /*
        switchcase 문을 사용 할때:
        어떤 값이 명확한 case 값으로 나타내질때

        if else 문을 사용 할때:
        여러 조건 또는 범위에 해당 할때 사용
        */

    }
}
