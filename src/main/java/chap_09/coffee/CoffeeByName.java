package chap_09.coffee;

public class CoffeeByName {
    public Object name;
    // Object로 만들기 때문에 Integer, Double, String... 사용 가능

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready(){
        System.out.println("커피 준비 완료 :" + name);
    }

}
