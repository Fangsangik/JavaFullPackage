package chap_09.coffee;

import chap_09.user.User;

// 제네릭스 타입을 제한 할 수 있다.
// <T extends User> 어떤 형태의 타입을 사용하던 상관은 없는데,
// 반드시 User라는 클레스를 상속하는 T를 사용
public class CoffeeByUser <T extends User>{
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready(){
        System.out.println("커피 준비 완료 :" + user.name);
        user.addPoint();
    }
}
