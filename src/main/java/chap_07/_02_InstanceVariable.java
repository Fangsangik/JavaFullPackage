package chap_07;

public class _02_InstanceVariable {
    public static void main(String[] args) {
        // 처음 만든 블랙박스 제품
        BlackBox b1 = new BlackBox();
        b1.modelname = "까망이";
        b1.resolution = "FHD";
        b1.price = 20;
        b1.color = "블랙";

        System.out.println(b1.modelname);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

        // 새로운 블랙박스 제품
        BlackBox b2 = new BlackBox();
        b2.modelname = "하양이";
        b2.resolution = "UHD";
        b2.price = 30;
        b2.color = "화이트";

        System.out.println("----------");

        System.out.println(b2.modelname);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);
    }
}
