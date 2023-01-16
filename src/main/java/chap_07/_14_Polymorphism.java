package chap_07;


import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class Person : 사람
        // class Student extends Person : 학생 (학생은 사람이다) = Student is a Person
        // class Teacher extends Person : 선생님 (선생님은 사람이다) = Teacher is a Person

        // 다형성을 활용 하면 앞 부분 클래스 명을 부모 클래스를 사용 가능
        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("-----------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras ) {
            cam.showMainFeature();
        }
        // 카메라 라는 이름으로 배열을 만들었고, 서로 다른 형태의 객체를 집어 넣음
        // 반복문을 통해서 showMainFeature을 활용

        System.out.println("----------------");
        //factoryCam.detectFire();
        //speedCam.checkSpeed();
        //카메라라는 이름의 부모클레스로 정의 -> 부모클레스에 있는 메소드만 접근이 가능 하다.

        if (camera instanceof Camera){
            //camera 객체가 Camera 클레스 객체로 부터 만들어진 객체 인지를 보는 것
            System.out.println("카메라 입니다.");
        }

        if (factoryCam instanceof FactoryCam){
            // factorycam을 형 변환
            // ((형 변환 하려는 클레스 명)객체).
            ((FactoryCam)factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCam){
            ((SpeedCam)speedCam).checkSpeed();
            ((SpeedCam)speedCam).recognizeLicensePlate();
        }

        // 기본적으로 자바에서는 Object 클레스를 상속
        // Object 배열을 활용하면 어떤 형태이건 간에 모든 클레스 객체를 집어 넣을 수 있다.
        Object[] o = new Object[3];
        o[0] = new Camera();
        o[1] = new FactoryCam();
        o[2] = new SpeedCam();
    }
}
