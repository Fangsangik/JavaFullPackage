package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형 Enum (=상수들의 묶음)
        // 달력 : Jan, Feb, MAR ...
        // 옷 사이즈 : S, M, L, XL

        //열거형 이름 변수 = 열겨형 이름.값
        Resolution resolution = Resolution.S;
        Resolution resolution1 = Resolution.M;
        Resolution resolution2 = Resolution.L;

        System.out.println(resolution);
        System.out.println(resolution1);
        System.out.println(resolution2);

        System.out.println("---------------");
        System.out.print("옷 사이즈 크기 :");
        switch (resolution) {
            case L:
                System.out.println("라지");
                break;
            case M:
                System.out.println("미디움");
                break;
            case S:
                System.out.println("스몰");
                break;
        }

        // 읽은 값을 열겨형으로 변환
        resolution = Resolution.valueOf("S");
        System.out.println(resolution);

        // for문 이용해서 순서 알아보기
        for (Resolution mySize : Resolution.values()){
            System.out.println(mySize.name()
                    + " : " + mySize.ordinal());
            //ordinal 열겨형 상수가 정의 된 순서
        }

        System.out.println("-------------");
        for (Resolution mySize:Resolution.values()){
            System.out.println(mySize.name()
                    + " : " + mySize.getSize());
        }

    }
}

//Enum 선언 법
enum Resolution {
    S(80), M(90), L(100);

    private final int size;
    Resolution(int size){
        this.size = size;
    }

    public int getSize() {
        return size;
    }


}
