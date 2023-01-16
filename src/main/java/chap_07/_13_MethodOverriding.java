package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

public class _13_MethodOverriding {
    public static void main(String[] args) {
        // 메소드 오버로딩과는 다름
        // 메소드 오버라이딩: 자식 클레스에서 부모 클레스의 메소드를 덮어 쓰기
        // 즉) 부모 클레스에서 정의 되어 있는 메소드를 자식 클레스에서 재정의 자식 클레스의 메소드가 호출
        // 자식 클레스에서 부모 클레스에 있는 메소드를 같은 형태로 만들어 줌
        // 자식 클레스에서 부모 클레스에 있는 메소드를 덮어 쓰기 때문에, 객체마다 서로 다른 동작을 할 수 있다.

        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();
    }
}
