package chap_07;

import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _015_Super {
    public static void main(String[] args) {
        // super
        // 자식 클레스 영역에 super.recordVideo();
        // super. 부모클레스에 있는 recordVideo를 실핼 하고 나서,
        // 추가로 자식 클레스에서 하는 기능을 실행
        // 자식 클레스의 생성자에 super(""); -> 부모 클레스의 생성자에 바로 접근

        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVideo();
        System.out.println("--------");
        speedCam.takePicture();
    }
}
