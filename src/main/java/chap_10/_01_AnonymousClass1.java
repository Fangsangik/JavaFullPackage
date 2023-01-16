package chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        //익명 클레스 (이름이 없는 클레스)
        //클레스 안에 클레스를 또 정의 가능 (내부클레스)
        Coffee c1 = new Coffee();
        c1.order("아마레카노");
        System.out.println("----------------");

        Coffee c2 = new Coffee();
        c2.order("라뗴");
        System.out.println("----------------");

        //익명 클레스
        //Coffee라는 객체를 만들때 특별히 sp 커피 객체만을 위해서
        //order라는 메소드를 재정의 할 수 있다.
        //기능을 확장하고, 1회성 기능
        Coffee sp = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("딸기 케익은 서비스");
            }

            @Override
            public void returnTray() {
                System.out.println("자리에 두시먄 제가 치울께요");
            }
        };
        sp.order("바닐라라떼");
        sp.returnTray();
    }
}
class Coffee{
    public void order(String coffee){
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void returnTray(){
        System.out.println("커피 반납이 완료 되었습니다.");
    }
}

