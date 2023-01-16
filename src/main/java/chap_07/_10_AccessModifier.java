package chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화 -> 서로 연관된 것 끼리만 묶어서 정의
        // 정보은닉 -> (information hiding) 허요하는 메소드 형태에서만 사용 할 수 있음

        // 접근 제어자
        // private -> 아무나 침범 X, 해당 클레스 내에서만 접근 가능
        // public -> 모든 클레스에서 접근 가능
        // default -> 아무것도 적지 않았을 때 같은 패키지 내에서 접근 가능
        // protected -> 같은 패키지 내에서, 다른 패키지인 경우에는 자식 클레스에서 접근 가능
        // 클레스에도 접근제어자 적용 가능

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelname = "까망이";
        //b1.resolution = "FHD";
        b1.setPrice(200000);
        b1.color = "블랙";

        //오류
        // 할인 행사
        b1.setPrice(- 5000);
        System.out.println("가격 :" + b1.getPrice() + " 원");

        // 고객 문의
        System.out.println("해상도 :" + b1.resolution);

        System.out.println("------");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelname("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 :" + b2.getPrice() + "원");
        System.out.println("해상도 :" + b2.getResolution());


    }
}

