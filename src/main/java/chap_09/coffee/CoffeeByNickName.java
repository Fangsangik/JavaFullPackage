package chap_09.coffee;

public class CoffeeByNickName {
    public String name;

    public CoffeeByNickName(String name) {
        this.name = name;
    }

    public void ready(){
        System.out.println("커피 준비 완료 :" + name);
    }
}
