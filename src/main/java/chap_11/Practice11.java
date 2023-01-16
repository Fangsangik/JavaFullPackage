package chap_11;

/*
인기가 많은 상품이 선착순으로 판매되는 온라인 쇼핑몰에서 발생할 수 있는 문제를 처리하는 프로그램을 작성하시오

조건
발생가능 문제의 2가지 조건: 상품 구매 가능 시간, 상품 매진
각 문제에 대한 사용자 정으 예외 클레스 작성
에러 코드에 따른 의도적 에외 발생 및 예외 처리

에러 코드에 따른 메시지
코드 의미          예외객체 생성 메시지          예외처리 메시지
0   에러없음      상품구매를 완료했습니다.                   -
1   판매시간 아님  상픔 구매시간이 아닙니다      상품 구매는 20시 부터 가능합니다
2   매진          해당 상품은 매진되었습니다.   다음 기회에 이용해주세요
 */

public class Practice11 {
    public static void main(String[] args) {
        int code = 1;
        try {
                if (code == 0) {
                    System.out.println("상품구매를 완료하였습니다.");
                } else if (code == 1) {
                    throw new OutOfTime("상픔 구매시간이 아닙니다.");
                } else if (code == 2) {
                    throw new OutofStock("해당 상품은 매진되었습니다.");
                }

        } catch (OutOfTime e){
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시 부터 가능합니다");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요");
        }
    }
}
class OutOfTime extends Exception {
    public OutOfTime(String message) {
        super(message);
    }
}

class OutofStock extends Exception{
    public OutofStock(String messsage){
        super(messsage);
    }
}
