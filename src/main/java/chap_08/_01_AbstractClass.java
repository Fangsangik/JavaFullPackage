package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화(Data Abstract)
        // 굳이 몰라도 되는 Data는 숨기고, 필요한 Data만
        // abstract
        // 추상 클레스 (아직 완성되지 않은 클레스)
        // 추상 메소드 (추상 클레스에서만 사용 가능한, 껍대기만 있는 메소드)

        // 추상 클레스는 아직 완성되지 않은 클레스 이기에,
        // 모호한 상태로는 객체를 만들 수 없다.
        // Camera camera = new Camera();

        // 추상 부모 클레스를 상속한 자식 클레스에서 객체 생성에는 문제 X
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();

    }
}
