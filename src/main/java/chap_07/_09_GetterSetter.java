package chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        //Getter & Setter
        //이상한 값이 들어간다던지, 값 설정 하다가 발생 할 수 있는 오류 줄일 수 있다.

        BlackBox b1 = new BlackBox();
        b1.modelname = "까망이";
        //b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "블랙";

        //오류
        // 할인 행사
        b1.price = - 5000;
        System.out.println("가격 :" + b1.price + " 원");

        // 고객 문의
        System.out.println("해상도 :" + b1.resolution);

        System.out.println("------");

        BlackBox b2 = new BlackBox();
        b2.setModelname("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 :" + b2.getPrice() + "원");
        System.out.println("해상도 :" + b2.getResolution());


    }
}
