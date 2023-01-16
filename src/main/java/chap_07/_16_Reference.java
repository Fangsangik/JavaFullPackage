package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Data Type) : int, float, double, long, boolean, ....
        // 값을 따로 지정 하지 않아도 기본 값을 갖는다.
        // 메소드가 없다.
        // 모두 소문자
        int[] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 (Non-primitive, Reference Data Type) : String, 참조 자료형
        // 참조 자료형의 경우 값을 따로 지정하지 않으면 Null로 반환
        // 메소드를 갖을 수 있다.
        // 대문자
        String[] s = new String[3];
        System.out.println(s[0]);

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null);

        System.out.println("------------------");
        //기본 자료형일땐 복사
        int a = 10;
        int b = 20;
        b=a;
        System.out.println(a);
        System.out.println(b);
        b=30;
        System.out.println(b);
        System.out.println(a);
        //a와 b 별도로 움직음

        //참조 (가르키는 대상이 달라진다)
        System.out.println("------------------");
        Camera camera = new Camera();
        Camera camera1 = new Camera();
        camera.name = "카메라";
        camera1.name = "카메라1";
        System.out.println(camera.name);
        System.out.println(camera1.name);

        camera1 = camera;
        System.out.println(camera.name);
        System.out.println(camera1.name);
        camera1.name="고장난 카메라";
        System.out.println(camera.name);
        System.out.println(camera1.name);
        //camera1이라는 객체는 어딘가에서 어딘가 만들어진 new Camera를 참조
        //camera1 = camera;를 적용하면 camera1dms camera = new Camera();를 적용받음
        //camera1.name="고장난 카메라";을 하면 둘다 바뀜

        changeName(camera1);
        System.out.println(("------------"));
        System.out.println(camera.name);
        System.out.println(camera1.name);
        //camera1의 값을 바꿨기 때문에 모두 첫번째 만들어진 카메라 객체를 가르킴

        //만약 객체와 관계를 끊고 싶다면
        camera1 = null;
        System.out.println(camera1.name); // null값 도출
    }

    public static void changeName(Camera camera){
        camera.name = "잘못된 카메라";
    }
}
