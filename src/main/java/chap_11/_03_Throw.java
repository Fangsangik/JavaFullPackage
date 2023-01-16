package chap_11;

public class _03_Throw {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 19) {
               // System.out.println("만 19세 미만에게는 판매하지 않습니다");
                throw new Exception("만 19세 미만에게는 판매하지 않습니다"); //throw = 새로운 예외 발생 시키기 => 던짐
            }else {
                System.out.println("주문하신 상품여기 있습니다");
            }
        }catch (Exception e){ //여기의 Exception이 예외를 받아서 예외처리 하는 구문이 실행이 됨
            e.printStackTrace();
        }
    }
}
