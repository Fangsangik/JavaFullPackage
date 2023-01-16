package chap_09.coffee;

public class CoffeeByNumber {
    public int waitingnumber;

    public CoffeeByNumber(int waitingnumber) {
        this.waitingnumber = waitingnumber;
    }

    public void ready(){
        System.out.println("커피 준비 완료 :" + waitingnumber);
    }

}
