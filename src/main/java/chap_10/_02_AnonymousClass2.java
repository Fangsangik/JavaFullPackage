package chap_10;

public class _02_AnonymousClass2 {

    public static void main(String[] args) {
        HomeMadeBurger mom = getMom();
        mom.cook();
        System.out.println("---------------");

        HomeMadeBurger bro = getBro();
        bro.cook();
        System.out.println("---------------");
    }

    //HomeMadeBurger 익명 클레스는 HomeMadeBurger라는 추상 클레스를 상속해서
    //cook이라는 메소드를 정의
    public static HomeMadeBurger getMom(){
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 수제 버거");
                System.out.println("재료 : 빵, 소고기, 양상추, 피클");
            }
        };
    }

    public static HomeMadeBurger getBro(){
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("군데리아");
            }
        };
    }
}

abstract class HomeMadeBurger{
    public abstract void cook();
}

//익명 클레스를 이용하면 추상 클레스 추상 메소드를 직접 구현하면서
//바로 이름 없이 추상 클레스를 구현한 객체를 전달 할 수 있게 된다.