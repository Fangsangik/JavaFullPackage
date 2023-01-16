package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VIP_User;

import java.net.CookieHandler;

public class _02_GenericClass {
    public static void main(String[] args) {
        // 제네릭 클레스
        // public class _02_GenericClass <T> -> 제네릭 클레스
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickName c2 = new CoffeeByNickName("루키 형");
        c2.ready();

        System.out.println("-----------");

        // Object 사용
        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("루키");
        c4.ready();

        System.out.println("-----------");
        // Object 사용 문제점
        int c3Name =(Integer) c3.name;
        System.out.println("주문 고객 번호 :" + c3.name);
        // 정수 값을 넣기를 기대하는데 Object가 들어옴
        // = 형 변환이 필요

        String c4Name =(String) c4.name;
        System.out.println("주문 고객 번호 :" + c4.name);

        // 정수를 문자열로 형 변환 시도 X
        // c4Name = (String) c3.name;

        System.out.println("-------------");

        // 제네릭스 클레스 만들기
        // 클레스<rapper class type> 변수 = new 클레스 명<>(rapper type);
        // 두 꺽쇠 안에 형태 동일해야 한다.
        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name ; // 형 변환 없이 값을 넣어줄 수 있다.
        System.out.println("주문 고객 번호 :" + c5Name);


        Coffee<String> c6 = new Coffee<>("루키 누나");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 번호 :" + c6Name);

        System.out.println("-------------");

        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("황상익"));
        // 황상익 이라고 이름을 갖은 객체를 형성하고, 그 객체를 CoffeeByUser에 넣어서 생성
        c7.ready();

        CoffeeByUser<VIP_User> c8 = new CoffeeByUser<>(new VIP_User("루키"));
        c8.ready();

        // 상속하지 않는 클레스를 넣을 경우 -> Error
        // CoffeeByUser<VIP_User> c9 = new CoffeeByUser<>(new BlackBox());

        System.out.println("-------------------");
        orderCoffee("박주연");
        orderCoffee(36);

        System.out.println("-------------------");

        orderCoffee("황상익" , "아메리카노");
        orderCoffee(36 , "아메리카노");

    }

    // 2개 이상 한번에 처리
    public static <T> void orderCoffee(T name) {
        System.out.println("커피 준비 완료 :" + name);
    }

    public static <T, V> void orderCoffee(T name, V coffee) {
        System.out.println(coffee + " 준비 완료 :" + name);
    }
}