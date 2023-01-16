package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        // 상속
        // 부모 클레스에서의 모든 것을 자식 클레스에서 가져다 쓴다.
        // 기능을 물려주는 입장 = 부모, 기능을 물려 받는 입장 = 자식
        // extends + 부모클레스
        // 상속 받은 자식 클레스는 부모 클레스 기능 다 사용 가능
        // 상속은 한 부모, 하나의 클레스로 부터만 상속이 가능

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.recordVideo();
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
