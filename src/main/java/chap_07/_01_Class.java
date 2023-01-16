package chap_07;

public class _01_Class {
    public static void main(String[] args) {
        // 객체지향 프로그래밍(OOP: Object-Oriented Programming)
        // 유지보수가 용이
        // 높은 재사용성

        // 차량용 블랙박스
        // 모델명, 해상도, 가격, 색상

        // 우리가 만든 첫 번째 제품
        String modleName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";

        //새로운 제품
         String modleName2 = "하양이";
         String resolution2 = "UHD";
         int price2 = 300000;
         String color2 = "화이트";

         //if 또다른 제품을 개발하게 된다면? -> 매번 새롭게 재구성 한다는 것은 비효율적

        //클레스로 부터 만들어 지는 것을 객체 라고 한다.
        // class 객체 이름 = new 클레스 이름 ();
        BlackBox bBox = new BlackBox();
        //BlackBox 클레스로 부터 bBox 객체를 형성 했다.
        //bBox 객체는 BlackBox 클레스의 인스턴스

        BlackBox bBox2 = new BlackBox();
    }
}
