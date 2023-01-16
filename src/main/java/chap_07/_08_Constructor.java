package chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        // 생성자라는 것은 객체가 만들어 질때 자동으로 호출 되는 메소드
        // 성자를 따로 정의해서 한번에 값을 전달 받고,
        // 그 값을 인스턴스 변수 넣거나, 또 다른 초기 작업을 생성자 내에서 가능 하다.

        BlackBox b1 = new BlackBox();

        String modleName = "까망이";
        String resolution = "FHD";
        int price = 200000;
        String color = "블랙";
        System.out.println(b1.modelname);
        System.out.println(b1.serialNumber);

        System.out.println("---------");

        BlackBox b2 = new BlackBox("하양이", "UHD", 300000, "화이트");
        System.out.println(b2.modelname);
        System.out.println(b2.serialNumber);

    }
}
