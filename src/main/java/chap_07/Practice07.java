package chap_07;

/*
클레스를 이용하여 햄버거를 자동으로 만드는 프로그램을 작성

조건
햄버거의 종류는 햄버거, 치즈버거, 새우버거 3가지
각 버거는 각각의 클래스로 생성
버거 이름을 담기위한 name 변수 정의
재료 정보를 표시하는 cook() 메소드 정으
공통 부분은 상속 및 메소드 오버라이딩으로 처리

모든 클레스는 하나의 파일에서 정의

햄버거 - 양상추, 피클, 패티
치즈버거 - 양상추, 피클, 패티, 치즈
새우버거 - 양상추, 피클, 패티, 새우


 */

public class Practice07 {
    public static void main(String[] args) {
        HamBurger[] hamBurgers = new HamBurger[3];
        hamBurgers[0] = new HamBurger("햄버거");
        hamBurgers[1] = new CheeseBurger();
        hamBurgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("------------");
        for (HamBurger hamBurger : hamBurgers) {
            hamBurger.cook();
            System.out.println("------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}

class HamBurger {
    public String name;

    public HamBurger(){
        this("햄버거");
    }

    public HamBurger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(name + "를 만듭니다.");
        System.out.println("빵 사이에 들어갈 재료는?");
        System.out.println("양상추, 피클, 패티");
    }
}

    class CheeseBurger extends HamBurger {
        public CheeseBurger() {
            super("치즈버거");
        }

        @Override
        public void cook(){
            super.cook();
            System.out.println("치즈");
        }
    }

    class ShrimpBurger extends HamBurger {
        public ShrimpBurger() {
            super("쉬림프버거");
        }

        @Override
        public void cook(){
           super.cook();
            System.out.println("새우");
        }
    }
